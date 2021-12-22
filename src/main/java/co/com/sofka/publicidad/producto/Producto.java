package co.com.sofka.publicidad.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.generico.TipoDocumento;
import co.com.sofka.publicidad.generico.CotizacionId;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.producto.enums.EstadoDiseño;
import co.com.sofka.publicidad.producto.events.*;
import co.com.sofka.publicidad.producto.values.*;

import java.util.List;
import java.util.Objects;

public class Producto extends AggregateEvent<ProductoId> {

    protected Nombre nombre;
    protected FechaEntrega fechaEntrega;
    protected Responsable responsable;
    protected Diseño diseño;
    protected CotizacionId cotizacionId;

    public Producto(ProductoId entityId, Nombre nombre, Responsable responsable, CotizacionId cotizacionId, FechaEntrega fechaEntrega, Diseño diseño){
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.responsable = Objects.requireNonNull(responsable);
        this.cotizacionId = Objects.requireNonNull(cotizacionId);
        this.fechaEntrega = Objects.requireNonNull(fechaEntrega);
        this.diseño = Objects.requireNonNull(diseño);
        appendChange(new ProductoCreado(nombre, cotizacionId, fechaEntrega, diseño)).apply();
    }

    private Producto(ProductoId entityId){
        super(entityId);
        subscribe(new ProductoChange(this));
    }

    public static Producto from(ProductoId productoId, List<DomainEvent> events){
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }

    public void asignarResponsable(ResponsableId responsableId, TipoDocumento tipoDocumento, NombreCompleto nombreCompleto, Cargo cargo, Antiguedad antiguedad){
        appendChange(new ResponsableAsignado(responsableId, tipoDocumento, nombreCompleto, cargo, antiguedad)).apply();
    }

    public void actualizarFechaEntrega(FechaEntrega fechaEntrega){
        appendChange(new FechaEntregaActualizada(fechaEntrega)).apply();
    }

    public void cambiarEstadoDeDiseño(EstadoDiseño estado){
        appendChange(new EstadoDeDiseñoActualizado(estado)).apply();
    }

    public void actualizarDatosDeResponsable(ResponsableId responsableId, TipoDocumento tipoDocumento, NombreCompleto nombreCompleto, Cargo cargo, Antiguedad antiguedad){
        appendChange(new DatosDeResponsableActualizados(responsableId, tipoDocumento, nombreCompleto, cargo, antiguedad)).apply();
    }

    public void solicitarInsumosParaDiseño(DiseñoId diseñoId, String nombre, Integer cantidad){
        appendChange(new InsumosParaDiseñoSolicitados(diseñoId, nombre, cantidad)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public FechaEntrega fechaEntrega() {
        return fechaEntrega;
    }

    public Responsable responsable() {
        return responsable;
    }

    public Diseño diseño() {
        return diseño;
    }

    public CotizacionId cotizacionId() {
        return cotizacionId;
    }
}
