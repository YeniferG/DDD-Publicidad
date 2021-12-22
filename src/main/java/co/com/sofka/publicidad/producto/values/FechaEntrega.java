package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class FechaEntrega implements ValueObject<String> {

    private final String fechaEntrega;

    public FechaEntrega(Integer dias){
        this.fechaEntrega = Objects.requireNonNull(calcularFechaEntrega(dias));
    }

    public String calcularFechaEntrega(Integer dias){
        return LocalDate.now().plusDays(dias).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaEntrega that = (FechaEntrega) o;
        return Objects.equals(fechaEntrega, that.fechaEntrega);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaEntrega);
    }

    @Override
    public String value() {
        return fechaEntrega;
    }
}
