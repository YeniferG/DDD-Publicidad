package co.com.sofka.publicidad.cliente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.publicidad.cliente.events.*;

public class ClienteChange extends EventChange {

    public ClienteChange(Cliente cliente) {

        apply((ClienteCreado event) -> {
            cliente.tipoDocumento = event.getTipoDocumento();
            cliente.nombreCompleto = event.getNombreCompleto();
            cliente.correo = event.getCorreo();
            cliente.telefono = event.getTelefono();
            cliente.direccion = event.getDireccion();
        });

        apply((DatosPersonalesActualizados event) -> {
            cliente.tipoDocumento = event.getTipoDocumento();
            cliente.nombreCompleto = event.getNombreCompleto();
            cliente.correo = event.getCorreo();
            cliente.telefono = event.getTelefono();
            cliente.direccion = event.getDireccion();
        });

        apply((SolicitudDeNovedadGenerada event) -> {
            cliente.novedades.add(event.getNovedades());
        });

        apply((FechaRealizacionDeNovedadActualizada event) -> {
            var funcion = cliente.getNovedadPorId(event.getNovedadId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la novedad"));
            funcion.actualizarFechaRealizacion(event.getFechaRealizacion());
        });

        apply((DetalleDeNovedadActualizado event) -> {
            var funcion = cliente.getNovedadPorId(event.getNovedadId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la novedad"));
            funcion.actualizarDetalle(event.getDetalle());
        });

    }
}
