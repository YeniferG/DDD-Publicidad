package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.generico.CotizacionId;

public class ActualizarFechaActualizacionDeEstado extends Command {

    private final CotizacionId cotizacionId;
    private final Fecha fechaActualizacion;

    public ActualizarFechaActualizacionDeEstado(CotizacionId cotizacionId, Fecha fechaActualizacion){
        this.cotizacionId = cotizacionId;
        this.fechaActualizacion = fechaActualizacion;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Fecha getFechaActualizacion() {
        return fechaActualizacion;
    }
}
