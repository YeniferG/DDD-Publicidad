package co.com.sofka.publicidad.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.producto.values.DiseñoId;
import co.com.sofka.publicidad.producto.values.ProductoId;

public class SolicitarInsumosParaDiseño extends Command {

    private final ProductoId productoId;
    private final DiseñoId diseñoId;
    private final String nombre;
    private final Integer cantidad;

    public SolicitarInsumosParaDiseño(ProductoId productoId, DiseñoId diseñoId, String nombre, Integer cantidad){

        this.productoId = productoId;
        this.diseñoId = diseñoId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }
}
