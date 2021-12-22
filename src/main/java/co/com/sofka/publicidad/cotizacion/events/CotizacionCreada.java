package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.generico.ClienteId;
import co.com.sofka.publicidad.generico.CotizacionId;

import java.util.List;

public class CotizacionCreada extends DomainEvent {

    private final CotizacionId entityId;
    private final ClienteId clienteId;

    public CotizacionCreada(CotizacionId entityId, ClienteId clienteId) {
        super("sofka.cotizacion.cotizacionCreada");
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
