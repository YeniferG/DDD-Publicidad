package co.com.sofka.publicidad.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cliente.values.Correo;
import co.com.sofka.publicidad.cliente.values.Direccion;
import co.com.sofka.publicidad.cliente.values.Telefono;
import co.com.sofka.publicidad.generico.TipoDocumento;
import co.com.sofka.publicidad.generico.NombreCompleto;

public class DatosPersonalesActualizados extends DomainEvent {

    private final TipoDocumento tipoDocumento;
    private final NombreCompleto nombreCompleto;
    private final Correo correo;
    private final Telefono telefono;
    private final Direccion direccion;

    public DatosPersonalesActualizados(TipoDocumento tipoDocumento, NombreCompleto nombreCompleto, Correo correo, Telefono telefono, Direccion direccion) {
        super("sofka.cliente.datosPersonalersActualizados");
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Correo getCorreo() {
        return correo;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
