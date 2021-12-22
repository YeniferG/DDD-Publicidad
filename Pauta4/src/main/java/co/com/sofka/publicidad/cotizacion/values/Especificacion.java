package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Especificacion implements ValueObject<Especificacion.Value> {

    private final String detalle;
    private final Integer cantidad;

    public Especificacion(String detalle, Integer cantidad) {
        this.detalle = Objects.requireNonNull(detalle);
        this.cantidad = Objects.requireNonNull(cantidad);
        if(this.detalle.isBlank()){
            throw new IllegalArgumentException("El detalle no puede estar vacía");
        }
        if(this.detalle.length()<3){
            throw new IllegalArgumentException("El detalle no puede tener menos de cuatro caractéres");
        }
        if(this.detalle.length()>100){
            throw new IllegalArgumentException("El detalle no puede tener más de cien caractéres");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especificacion that = (Especificacion) o;
        return Objects.equals(detalle, that.detalle) && Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detalle, cantidad);
    }
}
