package co.com.sofka.publicidad.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.producto.values.DiseñoId;
import co.com.sofka.publicidad.producto.enums.EstadoDiseño;

public class EstadoDeDiseñoActualizado extends DomainEvent {

    private final EstadoDiseño estado;

    public EstadoDeDiseñoActualizado(EstadoDiseño estado){
        super("sofka.producto.estadoDeDiseñoActualizado");
        this.estado = estado;
    }

    public EstadoDiseño getEstado() {
        return estado;
    }
}
