package U4.Tarea2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        System.out.println(lista1.getElementosInsertados());
        lista1.insertarNumPrincipio(4);
        lista1.insertarNumPrincipio(7);
        lista1.insertarNumFinal(9);
        Integer [] arrayPasar = {2,3,5,6,7};
        lista1.insertarListaFinal(arrayPasar);
        lista1.insertarNumFinal(34);
        lista1.insertarNumFinal(9);
        lista1.insertarNumPosicion(333,0);
        lista1.insertarNumFinal(9);
        System.out.println(lista1.getElementosInsertados());
        lista1.insertarNumFinal(100);


        System.out.println(lista1.getElementosInsertados());
        System.out.println(Arrays.toString(lista1.getArrayList()));
    }
}
