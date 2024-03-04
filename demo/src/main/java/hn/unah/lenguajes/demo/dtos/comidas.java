package hn.unah.lenguajes.demo.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class comidas {
    
    private String nombre;
    private double precio;
    private List<Ingredientes> ingredientes;

    public void AgregarIngrediente(Ingredientes ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public String toString(){
        return "Nombre" + this.nombre + "\n" + "Precio" + this.precio + "\n" + "Ingredientes" + this.ingredientes + "\n";
    }
}
