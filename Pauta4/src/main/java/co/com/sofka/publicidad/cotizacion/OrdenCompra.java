package co.com.sofka.publicidad.cotizacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.publicidad.cotizacion.values.Especificacion;
import co.com.sofka.publicidad.cotizacion.values.Fecha;
import co.com.sofka.publicidad.cotizacion.values.OrdenCompraId;
import co.com.sofka.publicidad.cotizacion.values.Valor;

import java.util.List;
import java.util.Objects;

public class OrdenCompra extends Entity<OrdenCompraId> {

    private Valor valor;
    private Fecha fechaElaboracion;
    private List<Especificacion> especificaciones;

    public OrdenCompra(OrdenCompraId entityId, Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones) {
        super(entityId);
        this.valor = valor;
        this.fechaElaboracion = fechaElaboracion;
        this.especificaciones = especificaciones;
    }

    public void modificarOrdenCompra(Valor valor, Fecha fechaElaboracion, List<Especificacion> especificaciones){
        this.valor = Objects.requireNonNull(valor);
        this.fechaElaboracion = Objects.requireNonNull(fechaElaboracion);
        this.especificaciones = Objects.requireNonNull(especificaciones);
    }

    public void actualizarValorTotal(Valor valor){
        this.valor = Objects.requireNonNull(valor);
    }

    public void actualizarFechaElaboracion(Fecha fechaElaboracion){
        this.fechaElaboracion = Objects.requireNonNull(fechaElaboracion);
    }

    public Valor valor() {
        return valor;
    }

    public Fecha fechaElaboracion() {
        return fechaElaboracion;
    }

    public List<Especificacion> especificaciones() {
        return especificaciones;
    }
}
