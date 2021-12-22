package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {

    private final String telefono;

    public Telefono(String telefono) {
        this.telefono = Objects.requireNonNull(telefono);
        if(this.telefono.isBlank()){
            throw new IllegalArgumentException("El telefono no puede estar vacío");
        }
        if(this.telefono.length()<7){
            throw new IllegalArgumentException("El telefono no puede tener menos de siete caractéres");
        }
        if(this.telefono.length()>13){
            throw new IllegalArgumentException("El telefono no puede tener más de trece caractéres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono1 = (Telefono) o;
        return Objects.equals(telefono, telefono1.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono);
    }

    @Override
    public String value() {
        return telefono;
    }
}
