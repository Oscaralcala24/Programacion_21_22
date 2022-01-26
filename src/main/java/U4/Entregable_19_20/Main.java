package U4.Entregable_19_20;

public class Main {
    public static void main(String[] args) {
        Pizzeria telepizza = new Pizzeria();

        for (Pizza.tamanoPizza tamano : Pizza.tamanoPizza.values()){
            System.out.println(tamano);
        }
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Ingrediente ingrediente1 = new Ingrediente("Bacon",400);
        Ingrediente ingrediente2 = new Ingrediente("Tomate",50);
        Ingrediente ingrediente3 = new Ingrediente("Piña",80);
        Ingrediente ingrediente4 = new Ingrediente("Jamon",280);
        Ingrediente ingrediente5 = new Ingrediente("Queso",250);
        pizza1.anadirIngredientes(ingrediente1);
        pizza1.anadirIngredientes(ingrediente2);
        pizza2.anadirIngredientes(ingrediente2);
        pizza2.anadirIngredientes(ingrediente2);
        pizza2.anadirIngredientes(ingrediente3);
        pizza1.mostrarInfoPizza();
        pizza2.mostrarInfoPizza();
        Pedido pedido1 = new Pedido(pizza1);
        Pedido pedido2 = new Pedido(pizza2);

        telepizza.anadirPedido(pedido1);
        telepizza.anadirPedido(pedido2);
        telepizza.mostrarCantidadPedido();
        telepizza.mostrarInfoPedidos();


    }
}
