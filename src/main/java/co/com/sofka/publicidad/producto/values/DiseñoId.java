package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.publicidad.cliente.values.NovedadId;

public class DiseñoId extends Identity {

    public DiseñoId(){}

    private DiseñoId(String id){
        super(id);
    }

    public static DiseñoId of(String id){
        return new DiseñoId();
    }
}
