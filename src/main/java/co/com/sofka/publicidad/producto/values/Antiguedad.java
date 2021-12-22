package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Antiguedad implements ValueObject<String> {

    private final String antiguedad;

    public Antiguedad(String antiguedad) {
        this.antiguedad = Objects.requireNonNull(antiguedad);
        if(this.antiguedad.isBlank()){
            throw new IllegalArgumentException("La antiguedad no puede estar vacía");
        }
        if(this.antiguedad.length()<3){
            throw new IllegalArgumentException("La antiguedad no puede tener menos de tres caractéres");
        }
        if(this.antiguedad.length()>20){
            throw new IllegalArgumentException("La locación no puede tener más de veinte caractéres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Antiguedad that = (Antiguedad) o;
        return Objects.equals(antiguedad, that.antiguedad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(antiguedad);
    }

    @Override
    public String value() {
        return antiguedad;
    }
}
