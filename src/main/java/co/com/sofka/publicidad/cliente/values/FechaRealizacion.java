package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.publicidad.cotizacion.values.Fecha;

import java.util.Date;

public class FechaRealizacion implements ValueObject<Date> {

    private Date fecha;

    public FechaRealizacion(){
        this.generarFecha();
    }

    public Date generarFecha(){
        return new Date();
    }

    @Override
    public Date value() {
        return fecha;
    }
}
