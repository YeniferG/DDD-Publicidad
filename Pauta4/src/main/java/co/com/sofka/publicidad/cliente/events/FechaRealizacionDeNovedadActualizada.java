package co.com.sofka.publicidad.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cliente.values.FechaRealizacion;
import co.com.sofka.publicidad.cliente.values.NovedadId;

public class FechaRealizacionDeNovedadActualizada extends DomainEvent {


    private final NovedadId novedadId;
    private final FechaRealizacion fechaRealizacion;

    public FechaRealizacionDeNovedadActualizada(NovedadId novedadId, FechaRealizacion fechaRealizacion) {
        super("sofka.cliente.fechaRealizacionDeNovedadActualizada");
        this.novedadId = novedadId;
        this.fechaRealizacion = fechaRealizacion;
    }

    public NovedadId getNovedadId() {
        return novedadId;
    }

    public FechaRealizacion getFechaRealizacion() {
        return fechaRealizacion;
    }
}
