package co.com.sofka.publicidad.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.publicidad.cliente.values.Detalle;
import co.com.sofka.publicidad.cliente.values.FechaRealizacion;
import co.com.sofka.publicidad.cliente.values.NovedadId;

public class Novedad extends Entity<NovedadId> {

    protected FechaRealizacion fechaRealizacion;
    protected Detalle detalle;

    public Novedad(NovedadId entityId, FechaRealizacion fechaRealizacion, Detalle detalle) {
        super(entityId);
        this.fechaRealizacion = fechaRealizacion;
        this.detalle = detalle;
    }

    public void actualizarFechaRealizacion(FechaRealizacion fechaRealizacion){
        this.fechaRealizacion = fechaRealizacion;
    }

    public void actualizarDetalle(Detalle detalle){
        this.detalle = detalle;
    }

    public FechaRealizacion getFechaRealizacion() {
        return fechaRealizacion;
    }

    public Detalle getDetalle() {
        return detalle;
    }
}
