package co.com.sofka.publicidad.producto.values;

import co.com.sofka.domain.generic.Identity;

public class ResponsableId extends Identity {

    public ResponsableId(){}

    private ResponsableId(String id){
        super(id);
    }

    public static ResponsableId of(String id){
        return new ResponsableId();
    }
}
