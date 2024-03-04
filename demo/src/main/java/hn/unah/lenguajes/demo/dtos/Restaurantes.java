package hn.unah.lenguajes.demo.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Restaurantes {

    private String nombre;
    private List<comidas> menu;


    public void AgregarComida(comidas comida) {
        this.menu.add(comida);
    }


    @Override
    public String toString(){
        return "Nombre=" + this.nombre + "\n" +"Menu="+ this.menu+ "\n";
    }

}
