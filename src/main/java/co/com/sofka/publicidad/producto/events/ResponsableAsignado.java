package co.com.sofka.publicidad.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.generico.TipoDocumento;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.producto.values.Antiguedad;
import co.com.sofka.publicidad.producto.values.Cargo;
import co.com.sofka.publicidad.producto.values.ResponsableId;

public class ResponsableAsignado extends DomainEvent {

    private final ResponsableId responsableId;
    private final TipoDocumento tipoDocumento;
    private final NombreCompleto nombreCompleto;
    private final Cargo cargo;
    private final Antiguedad antiguedad;

    public ResponsableAsignado(ResponsableId responsableId, TipoDocumento tipoDocumento, NombreCompleto nombreCompleto, Cargo cargo, Antiguedad antiguedad){
        super("sofka.producto.responsableAsignado");
        this.responsableId = responsableId;
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
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
