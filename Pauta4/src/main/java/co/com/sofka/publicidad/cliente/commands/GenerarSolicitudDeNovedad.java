package co.com.sofka.publicidad.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cliente.Novedad;
import co.com.sofka.publicidad.generico.ClienteId;

public class GenerarSolicitudDeNovedad extends Command {

    private final ClienteId clienteId;
    private final Novedad novedad;

    public GenerarSolicitudDeNovedad(ClienteId clienteId, Novedad novedad){

        this.clienteId = clienteId;
        this.novedad = novedad;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Novedad getNovedad() {
        return novedad;
    }
}
