package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {

    private String direccion;

    public Direccion(String calle, String carrera, String numero, String complemento){
        this.direccion = generarDireccionCompleta(calle, carrera, numero, complemento);
    }

    public String generarDireccionCompleta(String calle, String carrera, String numero, String complemento){
        return calle + " " + carrera + " " + numero + " " + complemento;
    }

    @Override
    public String value() {
        return direccion;
    }
}
