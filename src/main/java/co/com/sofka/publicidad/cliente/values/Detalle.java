package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Detalle implements ValueObject<String> {

    private String detalle;

    public Detalle(String detalle) {
        this.detalle = Objects.requireNonNull(detalle);
        if(this.detalle.isBlank()){
            throw new IllegalArgumentException("El detalle no puede estar vacía");
        }
        if(this.detalle.length()<3){
            throw new IllegalArgumentException("El detalle no puede tener menos de cuatro caractéres");
        }
        if(this.detalle.length()>100){
            throw new IllegalArgumentException("El detalle no puede tener más de cien caractéres");
        }
    }

    public void generarDetalle(String detalle){
        this.detalle = detalle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detalle detalle1 = (Detalle) o;
        return Objects.equals(detalle, detalle1.detalle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detalle);
    }

    @Override
    public String value() {
        return detalle;
    }


}
