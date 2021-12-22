package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Insumo implements ValueObject<Insumo.Value> {

    private final String nombre;
    private final Integer cantidad;

    public Insumo(String nombre, Integer cantidad) {
        this.nombre = Objects.requireNonNull(nombre);
        this.cantidad = Objects.requireNonNull(cantidad);
        if(this.nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacía");
        }
        if(this.nombre.length()>50){
            throw new IllegalArgumentException("El nombre no puede tener más de ciencuenta caractéres");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insumo insumo = (Insumo) o;
        return Objects.equals(nombre, insumo.nombre) && Objects.equals(cantidad, insumo.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidad);
    }
}
