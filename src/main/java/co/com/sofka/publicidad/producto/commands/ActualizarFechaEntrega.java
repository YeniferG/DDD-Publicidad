package co.com.sofka.publicidad.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.producto.values.FechaEntrega;
import co.com.sofka.publicidad.producto.values.ProductoId;

public class ActualizarFechaEntrega extends Command {

    private final ProductoId productoId;
    private final FechaEntrega fechaEntrega;

    public ActualizarFechaEntrega(ProductoId productoId, FechaEntrega fechaEntrega){
        this.productoId = productoId;
        this.fechaEntrega = fechaEntrega;
    }

    public FechaEntrega getFechaEntrega() {
        return fechaEntrega;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
