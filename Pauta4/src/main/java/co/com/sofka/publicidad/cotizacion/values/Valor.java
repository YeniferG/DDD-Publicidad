package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<Double> {

    private final Double total;

    public Valor(Double subtotal, Integer iva) {
        this.total = Objects.requireNonNull(calcularValorTotal(subtotal, iva));
        if(this.total <=0){
            throw new IllegalArgumentException("El total no puede ser menor o igual a 0");
        }
    }

    private Double calcularValorTotal(Double subtotal, Integer iva){
        return ((subtotal*iva)/100) + subtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valor valor = (Valor) o;
        return Objects.equals(total, valor.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total);
    }

    @Override
    public Double value() {
        return total;
    }
}
