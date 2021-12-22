package co.com.sofka.publicidad.cotizacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.publicidad.cotizacion.enums.Fase;
import co.com.sofka.publicidad.cotizacion.values.EstadoId;
import co.com.sofka.publicidad.cotizacion.values.Fecha;

import java.util.Objects;

public class Estado extends Entity<EstadoId> {

    protected Fecha fechaActualizacion;
    protected Fase fase;

    public Estado(EstadoId entityId, Fecha fechaActualizacion, Fase fase) {
        super(entityId);
        this.fechaActualizacion = fechaActualizacion;
        this.fase = fase;
    }

    public void cambiarFase(Fase fase){
        this.fase = Objects.requireNonNull(fase);
    }

    public void actualizarFechaActualizacion(Fecha fechaActualizacion){
        this.fechaActualizacion = Objects.requireNonNull(fechaActualizacion);
    }

    public Fecha fechaActualizacion() {
        return fechaActualizacion;
    }

    public Fase fase() {
        return fase;
    }
}
