package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Detalle implements ValueObject<String> {

    private String detalle;

    public Detalle(String detalle) {
        this.detalle = detalle;
    }

    public void generarDetalle(String detalle){
        this.detalle = detalle;
    }

    @Override
    public String value() {
        return detalle;
    }


}
