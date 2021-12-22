package co.com.sofka.publicidad.cotizacion;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.publicidad.cotizacion.events.*;
import co.com.sofka.publicidad.cotizacion.values.OrdenCompraId;


public class CotizacionChange extends EventChange {

    public CotizacionChange(Cotizacion cotizacion) {

        apply((CotizacionCreada event) -> {
            cotizacion.clienteId = event.getClienteId();
        });

        apply((DetalleEspecificacionAsignada event) -> {
            cotizacion.especificaciones.add(event.getEspecificacion());
        });

        apply((OrdenDeCompraGenerada event) -> {
            cotizacion.ordenCompra = new OrdenCompra(
                    new OrdenCompraId(),
                    event.getValor(),
                    event.getFechaElaboracion(),
                    event.getEspecificaciones());
        });

        apply((OrdenDeCompraModificada event) -> {
            cotizacion.ordenCompra.modificarOrdenCompra(
                    event.getValor(),
                    event.getFechaElaboracion(),
                    event.getEspecificaciones());
        });

        apply((ValorTotalDeOrdenCompraActualizado event) -> {
            cotizacion.ordenCompra.actualizarValorTotal(event.getValor());
        });

        apply((FechaElaboracionDeOrdenCompraActualizada event) -> {
            cotizacion.ordenCompra.actualizarFechaElaboracion(event.getFechaElaboracion());
        });

        apply((FaseDeEstadocambiada event) -> {
            cotizacion.estado.cambiarFase(event.getFase());
        });

        apply((FechaActualizacionDeEstadoActualizada event) -> {
            cotizacion.estado.actualizarFechaActualizacion(event.getFechaActualizacion());
        });



    }
}
