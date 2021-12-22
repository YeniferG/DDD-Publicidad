package co.com.sofka.publicidad.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.producto.enums.EstadoDiseño;
import co.com.sofka.publicidad.producto.values.ProductoId;

public class CambiarEstadoDeDiseño extends Command {

    private final ProductoId productoId;
    private final EstadoDiseño estado;

    public CambiarEstadoDeDiseño(ProductoId productoId, EstadoDiseño estado){
        this.productoId = productoId;
        this.estado = estado;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public EstadoDiseño getEstado() {
        return estado;
    }
}
