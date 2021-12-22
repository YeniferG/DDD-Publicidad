package co.com.sofka.publicidad.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cliente.values.TipoDocumento;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.producto.values.Antiguedad;
import co.com.sofka.publicidad.producto.values.Cargo;
import co.com.sofka.publicidad.producto.values.ResponsableId;

public class DatosDeResponsableActualizados extends DomainEvent {

    private final ResponsableId entityId;
    private final TipoDocumento tipoDocumento;
    private final NombreCompleto nombreCompleto;
    private final Cargo cargo;
    private final Antiguedad antiguedad;

    public DatosDeResponsableActualizados(ResponsableId entityId, TipoDocumento tipoDocumento, NombreCompleto nombreCompleto, Cargo cargo, Antiguedad antiguedad){
        super("sofka.producto.datosDeResponsableActualizados");
        this.entityId = entityId;
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
    }

    public ResponsableId getEntityId() {
        return entityId;
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
