package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.enums.Fase;

public class FaseDeEstadocambiada extends DomainEvent {

    private final Fase fase;

    public FaseDeEstadocambiada(Fase fase) {
        super("sofka.cotizacion.faseDeEstadoCambiada");
        this.fase = fase;
    }

    public Fase getFase() {
        return fase;
    }
}
