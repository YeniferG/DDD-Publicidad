package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.publicidad.cotizacion.values.Fecha;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class FechaRealizacion implements ValueObject<Date> {

    private Date fecha;

    public FechaRealizacion(){
        this.fecha = Objects.requireNonNull(generarFecha());
    }

    public Date generarFecha(){
        return new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaRealizacion that = (FechaRealizacion) o;
        return Objects.equals(fecha, that.fecha);
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
