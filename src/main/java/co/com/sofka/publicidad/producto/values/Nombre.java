package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
        if(this.nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if(this.nombre.length()>50){
            throw new IllegalArgumentException("El nombre no puede tener más de ciencuenta caractéres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(nombre, nombre1.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String value() {
        return nombre;
    }

}
