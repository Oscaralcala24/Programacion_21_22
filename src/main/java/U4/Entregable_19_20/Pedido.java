package U4.Entregable_19_20;

import java.time.LocalDateTime;

public class Pedido {

    private Pizza pizzaPedido;
    private LocalDateTime fechaHora = LocalDateTime.now();

    public Pedido(Pizza pizzaPedido) {
        this.pizzaPedido = pizzaPedido;
    }

    public Pedido() {
        this.pizzaPedido = new Pizza(Pizza.tamanoPizza.Familiar);
        Ingrediente ingrediente4 = new Ingrediente("Jamon",280);
        Ingrediente ingrediente5 = new Ingrediente("Queso",250);
        this.pizzaPedido.anadirIngredientes(ingrediente4);
        this.pizzaPedido.anadirIngredientes(ingrediente5);
        this.fechaHora = fechaHora;
    }


    public Pizza getPizzaPedido() {
        return pizzaPedido;
    }
    public void getPizza() {
        System.out.println("La pizza pedida fue: "+ pizzaPedido);
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

}
