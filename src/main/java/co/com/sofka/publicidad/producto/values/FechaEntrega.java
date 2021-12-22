package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class FechaEntrega implements ValueObject<String> {

    private final String fechaEntrega;

    public FechaEntrega(Integer dias){
        this.fechaEntrega = calcularFechaEntrega(dias);
    }

    public String calcularFechaEntrega(Integer dias){
        return LocalDate.now().plusDays(dias).toString();
    }

    @Override
    public String value() {
        return fechaEntrega;
    }
}
