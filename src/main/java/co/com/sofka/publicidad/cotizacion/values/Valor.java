package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Valor implements ValueObject<Double> {

    private final Double total;

    public Valor(Double subtotal, Integer iva) {
        this.total = calcularValorTotal(subtotal, iva);
    }

    private Double calcularValorTotal(Double subtotal, Integer iva){
        return ((subtotal*iva)/100) + subtotal;
    }

    @Override
    public Double value() {
        return total;
    }
}
