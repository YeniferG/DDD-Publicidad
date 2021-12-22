package co.com.sofka.publicidad.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cliente.values.Detalle;
import co.com.sofka.publicidad.cliente.values.NovedadId;

public class DetalleDeNovedadActualizado extends DomainEvent {


    private final NovedadId novedadId;
    private final Detalle detalle;

    public DetalleDeNovedadActualizado(NovedadId novedadId, Detalle detalle) {
        super("detalleDeNovedadActualizado");
        this.novedadId = novedadId;
        this.detalle = detalle;
    }

    public NovedadId getNovedadId() {
        return novedadId;
    }

    public Detalle getDetalle() {
        return detalle;
    }
}
