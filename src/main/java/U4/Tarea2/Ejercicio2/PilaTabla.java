package U4.Tarea2.Ejercicio2;

import java.util.Arrays;

public class PilaTabla {


    Integer[] pila = new Integer[0];

    public PilaTabla() {
        this.pila = pila;
    }

    void apilar(){
        setPila(1);
        this.pila[this.pila.length-1] = (int) (Math.random()*10);
    }

    void desapilar(){
        setPila(2);
    }

    Integer cima(){
        return pila[pila.length-2];
    }

    private void setPila(int accion) {
        if (accion == 1){
            this.pila = Arrays.copyOf(pila, pila.length+1);
        }else {
            this.pila = Arrays.copyOf(pila, pila.length-1);
        }
    }


}
