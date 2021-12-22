package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;

public class Fecha implements ValueObject<Date> {

    private final Date fecha;

    public Fecha() {
        this.fecha = generarFecha();
    }

    private Date generarFecha(){
        return new Date();
    }


    @Override
    public Date value() {
        return fecha;
    }
}
