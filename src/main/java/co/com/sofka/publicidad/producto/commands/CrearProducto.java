package co.com.sofka.publicidad.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.generico.CotizacionId;
import co.com.sofka.publicidad.producto.Diseño;
import co.com.sofka.publicidad.producto.Responsable;
import co.com.sofka.publicidad.producto.values.FechaEntrega;
import co.com.sofka.publicidad.producto.values.Nombre;
import co.com.sofka.publicidad.producto.values.ProductoId;

public class CrearProducto extends Command {

    private final ProductoId entityId;
    private final Nombre nombre;
    private final Responsable responsable;
    private final CotizacionId cotizacionId;
    private final FechaEntrega fechaEntrega;

    public CrearProducto(
            ProductoId entityId,
            Nombre nombre,
            Responsable responsable,
            CotizacionId cotizacionId,
            FechaEntrega fechaEntrega,
            Diseño diseño){

        this.entityId = entityId;
        this.nombre = nombre;
        this.responsable = responsable;
        this.cotizacionId = cotizacionId;
        this.fechaEntrega = fechaEntrega;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public FechaEntrega getFechaEntrega() {
        return fechaEntrega;
    }
}
