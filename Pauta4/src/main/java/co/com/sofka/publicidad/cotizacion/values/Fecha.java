package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {

    private final Date fecha;

    public Fecha() {
        this.fecha = Objects.requireNonNull(generarFecha());
    }

    private Date generarFecha(){
        return new Date();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha1 = (Fecha) o;
        return Objects.equals(fecha, fecha1.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }

    @Override
    public Date value() {
        return fecha;
    }
}
