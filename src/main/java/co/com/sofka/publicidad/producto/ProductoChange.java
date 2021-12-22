package co.com.sofka.publicidad.producto;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.publicidad.producto.events.*;
import co.com.sofka.publicidad.producto.values.ResponsableId;

public class ProductoChange extends EventChange {

    public ProductoChange(Producto producto){
        apply((ProductoCreado event) -> {
            producto.nombre = event.getNombre();
            producto.cotizacionId = event.getCotizacionId();
            producto.fechaEntrega = event.getFechaEntrega();
            producto.diseño = event.getDiseño();
        });

        apply((ResponsableAsignado event) -> {
            producto.responsable = new Responsable(
                    new ResponsableId(),
                    event.getTipoDocumento(),
                    event.getNombreCompleto(),
                    event.getCargo(),
                    event.getAntiguedad());
        });

        apply((FechaEntregaActualizada event) -> {
            producto.fechaEntrega = event.getFechaEntrega();
        });

        apply((EstadoDeDiseñoActualizado event) -> {
            producto.diseño.cambiarEstado(event.getEstado());
        });

        apply((DatosDeResponsableActualizados event) -> {
            producto.responsable.actualizarDatos(event.getNombreCompleto(), event.getCargo(), event.getAntiguedad());
        });
    }

}
