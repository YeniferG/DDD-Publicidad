package co.com.sofka.publicidad.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cotizacion.values.Valor;

public class ValorTotalDeOrdenCompraActualizado extends DomainEvent {
    private final Valor valor;

    public ValorTotalDeOrdenCompraActualizado(Valor valor) {
        super("sofka.cotizacion.valorTotalDeOrdenCompraActualizado");
        this.valor = valor;
    }

    public Valor getValor() {
        return valor;
    }
}
