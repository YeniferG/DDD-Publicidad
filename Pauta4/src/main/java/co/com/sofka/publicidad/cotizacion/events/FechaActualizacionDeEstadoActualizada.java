package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Fecha;

public class FechaActualizacionDeEstadoActualizada extends DomainEvent {

    private final Fecha fechaActualizacion;

    public FechaActualizacionDeEstadoActualizada(Fecha fechaActualizacion) {
        super("sofka.cotizacion.fechaAcatualizacionDeEstadoActualizada");
        this.fechaActualizacion = fechaActualizacion;
    }

    public Fecha getFechaActualizacion() {
        return fechaActualizacion;
    }
}
