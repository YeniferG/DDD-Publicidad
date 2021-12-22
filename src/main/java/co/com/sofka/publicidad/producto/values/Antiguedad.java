package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

public class Antiguedad implements ValueObject<String> {

    private final String antiguedad;

    public Antiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String value() {
        return antiguedad;
    }
}
