package co.com.sofka.publicidad.cotizacion.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.publicidad.cliente.values.NovedadId;

public class OrdenCompraId extends Identity {

    public OrdenCompraId(){}

    private OrdenCompraId(String id){
        super(id);
    }

    public static OrdenCompraId of(String id){
        return new OrdenCompraId();
    }
}
