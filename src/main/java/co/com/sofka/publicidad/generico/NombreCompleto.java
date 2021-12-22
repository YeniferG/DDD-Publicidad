package co.com.sofka.publicidad.generico;

import co.com.sofka.domain.generic.ValueObject;

public class NombreCompleto implements ValueObject<String> {

    private final String nombres;

    public NombreCompleto(String nombres, String apellidos) {
        this.nombres = generarNombreCompleto(nombres, apellidos);
    }

    public String generarNombreCompleto(String nombres, String apellidos){
        return nombres + " " + apellidos;
    }

    @Override
    public String value() {
        return nombres;
    }
}
