package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Fecha;

public class FechaElaboracionDeOrdenCompraActualizada extends DomainEvent {
    private final Fecha fechaElaboracion;

    public FechaElaboracionDeOrdenCompraActualizada(Fecha fechaElaboracion) {
        super("sofka.cotizacion.fechaElaboracionDeOrdenCompraActualizada");
        this.fechaElaboracion = fechaElaboracion;
    }

    public Fecha getFechaElaboracion() {
        return fechaElaboracion;
    }
}
