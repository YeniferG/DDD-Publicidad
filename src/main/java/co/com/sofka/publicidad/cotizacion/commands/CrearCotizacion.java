package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.generico.ClienteId;
import co.com.sofka.publicidad.generico.CotizacionId;

public class CrearCotizacion extends Command {

    private final CotizacionId entityId;
    private final ClienteId clienteId;

    public CrearCotizacion(CotizacionId entityId, ClienteId clienteId){
        this.entityId = entityId;
        this.clienteId = clienteId;
    }

    public CotizacionId getEntityId() {
        return entityId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
