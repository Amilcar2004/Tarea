package hn.unah.lenguajes.demo.controllers;
import hn.unah.lenguajes.demo.dtos.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/home")
public class RestauranteController {


    
    @GetMapping("/agregarcomida")
    public void AgregarComida(@RequestBody comidas comida,@RequestBody Restaurantes restaurante) {
        restaurante.AgregarComida(comida);
        System.out.println("Comida agregada al menu correctamente");
    }

    @GetMapping("/agregaringrediente/{comida}")
    public void AgregarIngrediente(@PathVariable String comida, @RequestBody Ingredientes ingrediente, @RequestBody comidas comidas) {
                comidas.AgregarIngrediente(ingrediente);
                System.out.println("Ingrediente agregado a la comida "+comida+" correctamente");
            }

    
    @GetMapping("/mostrarrestaurante/{restaurante}")
    public String mostrarrestaurante(@PathVariable Restaurantes restaurante) {
        return restaurante.toString();
    }
    
    @GetMapping("/mostrarcomidas/{comida}")
    public String mostrarcomidas(@PathVariable comidas comida) {
        return comida.toString();
    }
    @GetMapping("/mostraringrediente/{ingredientes}")
    public String mostrarrestaurante(@PathVariable Ingredientes ingrediente) {
        return ingrediente.toString();
    }

    }


