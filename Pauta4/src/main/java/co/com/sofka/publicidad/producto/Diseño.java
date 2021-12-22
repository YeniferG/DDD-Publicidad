package co.com.sofka.publicidad.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.publicidad.producto.values.DiseñoId;
import co.com.sofka.publicidad.producto.enums.EstadoDiseño;
import co.com.sofka.publicidad.producto.values.Insumo;

import java.util.List;
import java.util.Objects;

public class Diseño extends Entity<DiseñoId> {

    protected List<Insumo> insumos;
    protected EstadoDiseño estadoDiseño;

    public Diseño(DiseñoId entityId, List<Insumo> insumos, EstadoDiseño estadoDiseño) {
        super(entityId);
        this.insumos = insumos;
        this.estadoDiseño = estadoDiseño;
    }

    public void cambiarEstado(EstadoDiseño estadoDiseño){
        this.estadoDiseño = Objects.requireNonNull(estadoDiseño);
    }

    public void solicitarInsumos(String nombre, Integer cantidad){
        this.insumos.add(new Insumo(nombre, cantidad));
    }

    public List<Insumo> insumos() {
        return insumos;
    }

    public EstadoDiseño estadoDiseño() {
        return estadoDiseño;
    }
}
