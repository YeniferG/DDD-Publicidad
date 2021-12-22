package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.cotizacion.values.Valor;
import co.com.sofka.publicidad.generico.CotizacionId;

import java.util.List;

public class GenerarOrdenDeCompra extends Command {

    private final CotizacionId cotizacionId;
    private final Valor valor;
    private final Fecha fechaElaboracion;
    private final List<Especificacion> especificaciones;

    public GenerarOrdenDeCompra(CotizacionId cotizacionId, Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones){
        this.cotizacionId = cotizacionId;
        this.valor = valor;
        this.fechaElaboracion = fechaElaboracion;
        this.especificaciones = especificaciones;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Valor getValor() {
        return valor;
    }

    public Fecha getFechaElaboracion() {
        return fechaElaboracion;
    }

    public List<Especificacion> getEspecificaciones() {
        return especificaciones;
    }
}
