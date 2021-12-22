package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

    private String direccion;

    public Direccion(String calle, String carrera, String numero, String complemento){
        this.direccion = Objects.requireNonNull(generarDireccionCompleta(calle, carrera, numero, complemento));
        if(this.direccion.isBlank()){
            throw new IllegalArgumentException("La direccion no puede estar vacía");
        }
        if(this.direccion.length()<3){
            throw new IllegalArgumentException("La direccion no puede tener menos de cuatro caractéres");
        }
        if(this.direccion.length()>100){
            throw new IllegalArgumentException("La direccion no puede tener más de cien caractéres");
        }
    }

    public String generarDireccionCompleta(String calle, String carrera, String numero, String complemento){
        return calle + " " + carrera + " " + numero + " " + complemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion1 = (Direccion) o;
        return Objects.equals(direccion, direccion1.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }

    @Override
    public String value() {
        return direccion;
    }
}
