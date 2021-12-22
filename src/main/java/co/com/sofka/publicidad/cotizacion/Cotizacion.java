package co.com.sofka.publicidad.cotizacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.enums.Fase;
import co.com.sofka.publicidad.cotizacion.events.*;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.cotizacion.values.OrdenCompraId;
import co.com.sofka.publicidad.cotizacion.values.Valor;
import co.com.sofka.publicidad.generico.ClienteId;
import co.com.sofka.publicidad.generico.CotizacionId;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cotizacion extends AggregateEvent<CotizacionId> {

    protected ClienteId clienteId;
    protected List<Especificacion> especificaciones = new ArrayList<>();
    protected OrdenCompra ordenCompra;
    protected Estado estado;

    public Cotizacion(CotizacionId entityId, ClienteId clienteId) {
        super(entityId);
        appendChange(new CotizacionCreada(entityId, clienteId)).apply();
    }

    private Cotizacion(CotizacionId entityId){
        super(entityId);
        subscribe(new CotizacionChange(this));
    }

    public static Cotizacion from(CotizacionId cotizacionId, List<DomainEvent> events){
        var cotizacion = new Cotizacion(cotizacionId);
        events.forEach(cotizacion::applyEvent);
        return cotizacion;
    }

    public void generarDetalleEspecificacion(Especificacion especificacion){
        appendChange(new DetalleEspecificacionAsignada(especificacion)).apply();
    }

    public void generarOrdenDeCompra(Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones){
        appendChange(new OrdenDeCompraGenerada(valor,fechaElaboracion, especificaciones)).apply();
    }

    public void modificarOrdenDeCompra(OrdenCompraId ordenCompraId, Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones){
        appendChange(new OrdenDeCompraModificada(ordenCompraId, valor, fechaElaboracion, especificaciones)).apply();
    }

    public void actualizarValorTotalDeOrdenCompra(Valor valor){
        appendChange(new ValorTotalDeOrdenCompraActualizado(valor)).apply();
    }

    public void actualizarFechaElaboracionDeOrdenCompra(Fecha fechaElaboracion){
        appendChange(new FechaElaboracionDeOrdenCompraActualizada(fechaElaboracion)).apply();
    }

    public void cambiarFaseDeEstado(Fase fase){
        appendChange(new FaseDeEstadocambiada(fase)).apply();
    }

    public void actualizarFechaActualizacionDeEstado(Fecha fechaActualizacion){
        appendChange(new FechaActualizacionDeEstadoActualizada(fechaActualizacion)).apply();
    }

}
