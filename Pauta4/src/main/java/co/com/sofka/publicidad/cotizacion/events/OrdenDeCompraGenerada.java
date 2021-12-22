package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.cotizacion.values.Valor;

import java.util.List;

public class OrdenDeCompraGenerada extends DomainEvent {

    private final Valor valor;
    private final Fecha fechaElaboracion;
    private final List<Especificacion> especificaciones;

    public OrdenDeCompraGenerada(Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones) {
        super("sofka.cotizacion.ordenDeCompraGenerada");
        this.valor = valor;
        this.fechaElaboracion = fechaElaboracion;
        this.especificaciones = especificaciones;
    }

    public Valor getValor(){
        return this.valor;
    }

    public Fecha getFechaElaboracion(){
        return this.fechaElaboracion;
    }

    public List<Especificacion> getEspecificaciones() {
        return especificaciones;
    }
}
