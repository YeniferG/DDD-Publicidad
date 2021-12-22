package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

public class Cargo implements ValueObject<String> {

    private final String cargo;

    public Cargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String value() {
        return cargo;
    }
}

