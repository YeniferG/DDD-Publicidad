package co.com.sofka.publicidad.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cliente.values.FechaRealizacion;
import co.com.sofka.publicidad.cliente.values.NovedadId;
import co.com.sofka.publicidad.generico.ClienteId;

public class ActualizarFechaRealizacionDeNovedad extends Command {

    private final ClienteId clienteId;
    private final NovedadId novedadId;
    private final FechaRealizacion fechaRealizacion;

    public ActualizarFechaRealizacionDeNovedad(ClienteId clienteId, NovedadId novedadId, FechaRealizacion fechaRealizacion){

        this.clienteId = clienteId;
        this.novedadId = novedadId;
        this.fechaRealizacion = fechaRealizacion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public NovedadId getNovedadId() {
        return novedadId;
    }

    public FechaRealizacion getFechaRealizacion() {
        return fechaRealizacion;
    }
}
