package co.com.sofka.publicidad.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.producto.values.DiseñoId;

public class InsumosParaDiseñoSolicitados extends DomainEvent {

    private final DiseñoId diseñoId;
    private final String nombre;
    private final Integer cantidad;

    public InsumosParaDiseñoSolicitados(DiseñoId diseñoId, String nombre, Integer cantidad){
        super("sofka.producto.insumosParaDiseñoSolicitados");
        this.diseñoId = diseñoId;
        this.nombre = nombre;
        this.cantidad = cantidad;
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
