package U4.Entregable_19_20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pizzeria {


    private Pedido[] numPedidos = new Pedido[5];
    private int contadorPedidos = 0;

    public Pizzeria() {
        this.numPedidos = numPedidos;
    }

    public Pizzeria(int cantidad) {
        this.numPedidos = Arrays.copyOf(this.numPedidos, cantidad);
    }

    public void anadirPedido(Pedido pedidoPizzeria){
        if (contadorPedidos>=5){
            this.numPedidos = Arrays.copyOf(this.numPedidos, this.numPedidos.length+1);
            numPedidos[contadorPedidos++] = pedidoPizzeria;
        }else {
            numPedidos[contadorPedidos++] = pedidoPizzeria;
        }
    }

    public void mostrarInfoPedidos(){
        System.out.println("Informacion de los pedidos: ");
        System.out.println(Arrays.toString(getNumPedidos()));
    }

    public void mostrarCantidadPedido(){
        System.out.println("Se han realizado "+contadorPedidos+ " pedidos.");
    }

    public Pedido[] getNumPedidos() {
        return numPedidos;
    }
}
