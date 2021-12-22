package co.com.sofka.publicidad.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.publicidad.generico.TipoDocumento;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.producto.values.Antiguedad;
import co.com.sofka.publicidad.producto.values.Cargo;
import co.com.sofka.publicidad.producto.values.ResponsableId;

import java.util.Objects;

public class Responsable extends Entity<ResponsableId> {

    protected TipoDocumento tipoDocumento;
    protected NombreCompleto nombreCompleto;
    protected Cargo cargo;
    protected Antiguedad antiguedad;

    public Responsable(ResponsableId entityId, TipoDocumento tipoDocumento, NombreCompleto nombreCompleto, Cargo cargo, Antiguedad antiguedad) {
        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
    }

    public void actualizarDatos(NombreCompleto nombreCompleto, Cargo cargo, Antiguedad antiguedad){
        this.nombreCompleto = Objects.requireNonNull(nombreCompleto);
        this.cargo = Objects.requireNonNull(cargo);
        this.antiguedad = Objects.requireNonNull(antiguedad);
    }



    public TipoDocumento tipoDocumento() {
        return tipoDocumento;
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }

    public Cargo cargo() {
        return cargo;
    }

    public Antiguedad antiguedad() {
        return antiguedad;
    }
}
