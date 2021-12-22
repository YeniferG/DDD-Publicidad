package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Especificacion implements ValueObject<Especificacion.Value> {

    private final String detalle;
    private final Integer cantidad;

    public Especificacion(String detalle, Integer cantidad) {
        this.detalle = detalle;
        this.cantidad = cantidad;
    }

    @Override
    public Especificacion.Value value() {
        return new Especificacion.Value() {
            @Override
            public String detalle() {
                return detalle;
            }
            @Override
            public Integer cantidad() {
                return cantidad;
            }
        };
    }

    public interface Value{
        String detalle();
        Integer cantidad();
    }
}
