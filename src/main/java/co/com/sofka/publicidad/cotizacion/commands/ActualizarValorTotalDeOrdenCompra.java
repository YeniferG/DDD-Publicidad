package co.com.sofka.publicidad.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cotizacion.values.Valor;
import co.com.sofka.publicidad.generico.CotizacionId;

public class ActualizarValorTotalDeOrdenCompra extends Command {

    private final CotizacionId cotizacionId;
    private final Valor valor;

    public ActualizarValorTotalDeOrdenCompra(CotizacionId cotizacionId, Valor valor){
        this.cotizacionId = cotizacionId;
        this.valor = valor;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Valor getValor() {
        return valor;
    }
}
