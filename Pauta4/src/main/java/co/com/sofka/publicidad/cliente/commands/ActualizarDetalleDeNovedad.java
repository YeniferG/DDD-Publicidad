package co.com.sofka.publicidad.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cliente.values.Detalle;
import co.com.sofka.publicidad.cliente.values.NovedadId;

public class ActualizarDetalleDeNovedad extends Command {

    private final NovedadId novedadId;
    private final Detalle detalle;

    public ActualizarDetalleDeNovedad(NovedadId novedadId, Detalle detalle){

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
