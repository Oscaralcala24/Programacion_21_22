package U4.Entregable_19_20;

import java.util.Arrays;

public class Pizza {



    private tamanoPizza tamano;

    private Ingrediente [] ingredientesPizza = new Ingrediente[0];


    public Pizza(tamanoPizza tamano) {
        this.tamano = tamano;
    }
    public Pizza() {
        this.tamano = tamanoPizza.Familiar;
    }
    boolean anadirIngredientes(Ingrediente ingrediente){
        boolean incompleta = false;
        if (ingredientesPizza.length<3){
            incompleta = true;
            setIngredientesPizza();
            ingredientesPizza[ingredientesPizza.length-1] = ingrediente;
        }
        return incompleta;
    }

    public void getTamanosPizza(){
        System.out.println("Los tamaños disponibles son: ");
        System.out.println("- "+ tamanoPizza.Familiar);
        System.out.println("- "+ tamanoPizza.Mediana);
    }



    public static enum tamanoPizza {
        Mediana,
        Familiar;
    }

    public void mostrarInfoPizza(){
        System.out.println("El tamaño de la pizza es: "+getTamano());
        System.out.println("Los ingredientes que lleva son: ");
        for (int i = 0; i < ingredientesPizza.length; i++) {
            ingredientesPizza[i].getNombreIngrediente();
        }

    }

    public void setIngredientesPizza() {
        this.ingredientesPizza = Arrays.copyOf(ingredientesPizza, ingredientesPizza.length+1);
    }

    public tamanoPizza getTamano() {
        return tamano;
    }

    public void getNumIngredientes(){
        System.out.println("La pizza tiene "+ingredientesPizza.length+" ingredientes");
    }

    public void getIngredientesPizza() {
        for (int i = 0; i < ingredientesPizza.length; i++) {
            ingredientesPizza[i].getNombreIngrediente();
        }
    }

}
