package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;

public class DetalleEspecificacionAsignada extends DomainEvent {

    private final Especificacion especificacion;

    public DetalleEspecificacionAsignada(Especificacion especificacion) {
        super("sofka.cotizacion.detalleEspecificacionAsignada");
        this.especificacion = especificacion;
    }

    public Especificacion getEspecificacion() {
        return especificacion;
    }
}
