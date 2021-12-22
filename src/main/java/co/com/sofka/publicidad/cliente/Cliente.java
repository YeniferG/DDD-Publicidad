package co.com.sofka.publicidad.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.publicidad.cliente.events.DetalleDeNovedadActualizado;
import co.com.sofka.publicidad.cliente.events.FechaRealizacionDeNovedadActualizada;
import co.com.sofka.publicidad.cliente.values.*;
import co.com.sofka.publicidad.cliente.events.ClienteCreado;
import co.com.sofka.publicidad.cliente.events.DatosPersonalesActualizados;
import co.com.sofka.publicidad.cliente.events.SolicitudDeNovedadGenerada;
import co.com.sofka.publicidad.generico.ClienteId;
import co.com.sofka.publicidad.generico.NombreCompleto;
import co.com.sofka.publicidad.generico.TipoDocumento;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {

    protected TipoDocumento tipoDocumento;
    protected NombreCompleto nombreCompleto;
    protected Correo correo;
    protected Telefono telefono;
    protected Direccion direccion;
    protected List<Novedad> novedades = new ArrayList<>();

    public Cliente(ClienteId entityId,
                   TipoDocumento tipoDocumento,
                   NombreCompleto nombreCompleto,
                   Correo correo,
                   Telefono telefono,
                   Direccion direccion) {

        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        appendChange(new ClienteCreado(tipoDocumento,
                nombreCompleto,
                correo,
                telefono,
                direccion)).apply();
    }

    private Cliente(ClienteId entityId){
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void actualizarDatosPersonales(TipoDocumento tipoDocumento,
                                          NombreCompleto nombreCompleto,
                                          Correo correo,
                                          Telefono telefono,
                                          Direccion direccion){

        appendChange(new DatosPersonalesActualizados(tipoDocumento, nombreCompleto, correo, telefono, direccion)).apply();

    }

    public void generarSolicitudDeNovedad(Novedad novedad){
        appendChange(new SolicitudDeNovedadGenerada(novedad)).apply();
    }

    public void actualizarFechaRealizacionDeNovedad(NovedadId novedadId,FechaRealizacion fechaRealizacion){
        appendChange(new FechaRealizacionDeNovedadActualizada(novedadId, fechaRealizacion)).apply();
    }

    public void actualizarDetalleDeNovedad(NovedadId novedadId, Detalle detalle){
        appendChange(new DetalleDeNovedadActualizado(novedadId, detalle)).apply();
    }

}
