package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.generico.CotizacionId;

public class ActualizarFechaElaboracionDeOrdenCompra extends Command {

    private final CotizacionId cotizacionId;
    private final Fecha fechaElaboracion;

    public ActualizarFechaElaboracionDeOrdenCompra(CotizacionId cotizacionId, Fecha fechaElaboracion){
        this.cotizacionId = cotizacionId;
        this.fechaElaboracion = fechaElaboracion;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Fecha getFechaElaboracion() {
        return fechaElaboracion;
    }
}
