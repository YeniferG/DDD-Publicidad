package co.com.sofka.publicidad.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class NovedadId extends Identity {

    public NovedadId(){}

    private NovedadId(String id){
        super(id);
    }

    public static NovedadId of(String id){
        return new NovedadId();
    }
}
