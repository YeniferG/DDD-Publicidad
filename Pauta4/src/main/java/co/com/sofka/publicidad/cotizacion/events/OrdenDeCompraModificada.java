package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.cotizacion.values.OrdenCompraId;
import co.com.sofka.publicidad.cotizacion.values.Valor;

import java.util.List;

public class OrdenDeCompraModificada extends DomainEvent {
    private final OrdenCompraId ordenCompraId;
    private final Valor valor;
    private final Fecha fechaElaboracion;
    private final List<Especificacion> especificaciones;

    public OrdenDeCompraModificada(OrdenCompraId ordenCompraId, Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones) {
        super("sofka.cotizacion.ordenDeCompraModificada");
        this.ordenCompraId = ordenCompraId;
        this.valor = valor;
        this.fechaElaboracion = fechaElaboracion;
        this.especificaciones = especificaciones;
    }

    public OrdenCompraId getOrdenCompraId() {
        return ordenCompraId;
    }

    public Valor getValor() {
        return valor;
    }

    public Fecha getFechaElaboracion() {
        return fechaElaboracion;
    }

    public List<Especificacion> getEspecificaciones() {
        return especificaciones;
    }
}
