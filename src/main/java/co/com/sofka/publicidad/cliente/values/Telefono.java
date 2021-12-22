package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {

    private final String telefono;

    public Telefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String value() {
        return telefono;
    }
}
