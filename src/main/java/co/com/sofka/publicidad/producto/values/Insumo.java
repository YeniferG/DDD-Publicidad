package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

public class Insumo implements ValueObject<Insumo.Value> {

    private final String nombre;
    private final Integer cantidad;

    public Insumo(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public Insumo.Value value() {
        return new Value() {
            @Override
            public String nombre() {
                return nombre;
            }
            @Override
            public Integer cantidad() {
                return cantidad;
            }
        };
    }

    public interface Value{
        String nombre();
        Integer cantidad();
    }
}
