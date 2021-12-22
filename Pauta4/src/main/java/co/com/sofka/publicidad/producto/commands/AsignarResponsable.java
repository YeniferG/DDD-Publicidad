package co.com.sofka.publicidad.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.generico.TipoDocumento;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.producto.values.Antiguedad;
import co.com.sofka.publicidad.producto.values.Cargo;
import co.com.sofka.publicidad.producto.values.ProductoId;
import co.com.sofka.publicidad.producto.values.ResponsableId;

public class AsignarResponsable extends Command {

    private final ProductoId productoId;
    private final ResponsableId responsableId;
    private final TipoDocumento tipoDocumento;
    private final NombreCompleto nombreCompleto;
    private final Cargo cargo;
    private final Antiguedad antiguedad;

    public AsignarResponsable(
            ProductoId productoId,
            ResponsableId responsableId,
            TipoDocumento tipoDocumento,
            NombreCompleto nombreCompleto,
            Cargo cargo,
            Antiguedad antiguedad){

        this.productoId = productoId;
        this.responsableId = responsableId;
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public ResponsableId getResponsableId() {
        return responsableId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Antiguedad getAntiguedad() {
        return antiguedad;
    }
}
