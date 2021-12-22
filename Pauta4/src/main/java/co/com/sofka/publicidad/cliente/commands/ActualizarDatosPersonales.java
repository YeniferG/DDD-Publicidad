package co.com.sofka.publicidad.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.publicidad.cliente.values.Correo;
import co.com.sofka.publicidad.cliente.values.Direccion;
import co.com.sofka.publicidad.cliente.values.Telefono;
import co.com.sofka.publicidad.generico.ClienteId;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.generico.TipoDocumento;

public class ActualizarDatosPersonales extends Command {

    private final ClienteId clienteId;
    private final TipoDocumento tipoDocumento;
    private final NombreCompleto nombreCompleto;
    private final Correo correo;
    private final Telefono telefono;
    private final Direccion direccion;

    public ActualizarDatosPersonales(ClienteId clienteId,
                                     TipoDocumento tipoDocumento,
                                     NombreCompleto nombreCompleto,
                                     Correo correo,
                                     Telefono telefono,
                                     Direccion direccion){

        this.clienteId = clienteId;
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public ClienteId getClienteId() {
        return clienteId;
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
