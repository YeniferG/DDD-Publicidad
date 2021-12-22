package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cargo implements ValueObject<String> {

    private final String cargo;

    public Cargo(String cargo) {
        this.cargo = Objects.requireNonNull(cargo);
        if(this.cargo.isBlank()){
            throw new IllegalArgumentException("El cargo no puede estar vacía");
        }
        if(this.cargo.length()>20){
            throw new IllegalArgumentException("El cargo no puede tener más de veinte caractéres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo1 = (Cargo) o;
        return Objects.equals(cargo, cargo1.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo);
    }

    @Override
    public String value() {
        return cargo;
    }
}

