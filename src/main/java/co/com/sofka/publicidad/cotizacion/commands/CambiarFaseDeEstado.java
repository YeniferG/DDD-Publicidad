package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cotizacion.enums.Fase;
import co.com.sofka.publicidad.generico.CotizacionId;

public class CambiarFaseDeEstado extends Command {

    private final CotizacionId cotizacionId;
    private final Fase fase;

    public CambiarFaseDeEstado(CotizacionId cotizacionId, Fase fase){
        this.cotizacionId = cotizacionId;
        this.fase = fase;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Fase getFase() {
        return fase;
    }
}
