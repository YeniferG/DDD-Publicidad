package co.com.sofka.publicidad.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.publicidad.generico.ClienteId;

public class Cliente extends AggregateEvent<ClienteId> {

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

}
