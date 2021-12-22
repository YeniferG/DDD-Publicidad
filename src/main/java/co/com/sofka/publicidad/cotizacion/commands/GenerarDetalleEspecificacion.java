package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.generico.CotizacionId;

public class GenerarDetalleEspecificacion extends Command {

    private final CotizacionId cotizacionId;
    private final Especificacion especificacion;

    public GenerarDetalleEspecificacion(CotizacionId cotizacionId, Especificacion especificacion){
        this.cotizacionId = cotizacionId;
        this.especificacion = especificacion;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Especificacion getEspecificacion() {
        return especificacion;
    }
}
