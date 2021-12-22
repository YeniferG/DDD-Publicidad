package co.com.sofka.publicidad.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cliente.Novedad;

public class SolicitudDeNovedadGenerada extends DomainEvent {

    private final Novedad novedades;

    public SolicitudDeNovedadGenerada(Novedad novedades) {
        super("sofka.cliente.solicitudDeNovedadGenerada");
        this.novedades = novedades;
    }

    public Novedad getNovedades() {
        return novedades;
    }
}
