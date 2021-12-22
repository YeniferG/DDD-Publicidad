package co.com.sofka.publicidad.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.producto.values.FechaEntrega;
import co.com.sofka.publicidad.producto.values.ProductoId;

public class FechaEntregaActualizada extends DomainEvent {

    private final FechaEntrega fechaEntrega;

    public FechaEntregaActualizada(FechaEntrega fechaEntrega){
        super("sofka.producto.fechaEntregaActualizada");
        this.fechaEntrega = fechaEntrega;
    }

    public FechaEntrega getFechaEntrega() {
        return fechaEntrega;
    }
}
