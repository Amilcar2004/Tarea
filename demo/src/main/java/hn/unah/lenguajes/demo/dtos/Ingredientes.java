package hn.unah.lenguajes.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredientes {
    
    private String codigo;
    private String descripcion;

    @Override
    public String toString(){
        return "Codigo= "+this.codigo +"\n" + "Descripcion= "+this.descripcion +"\n";
    }
}
