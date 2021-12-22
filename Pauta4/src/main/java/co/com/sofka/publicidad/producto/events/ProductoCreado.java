package co.com.sofka.publicidad.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.generico.CotizacionId;
import co.com.sofka.publicidad.producto.Diseño;
import co.com.sofka.publicidad.producto.Responsable;
import co.com.sofka.publicidad.producto.values.FechaEntrega;
import co.com.sofka.publicidad.producto.values.Nombre;

public class ProductoCreado extends DomainEvent {

    private final Nombre nombre;
    private final CotizacionId cotizacionId;
    private final FechaEntrega fechaEntrega;
    private final Diseño diseño;

    public ProductoCreado(Nombre nombre, CotizacionId cotizacionId, FechaEntrega fechaEntrega, Diseño diseño){
        super("sofka.producto.productoCreado");
        this.nombre = nombre;
        this.cotizacionId = cotizacionId;
        this.fechaEntrega = fechaEntrega;
        this.diseño = diseño;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public FechaEntrega getFechaEntrega() {
        return fechaEntrega;
    }

    public Diseño getDiseño() {
        return diseño;
    }
}
