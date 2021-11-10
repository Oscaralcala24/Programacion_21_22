package U3.T3;

//Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
// Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera,
// de forma que los 12 números sigan ordenados.
// Fusionar significa copiar en el orden correcto para que los datos resultantes continúen
// ordenados sin necesidad de volver a realizar una ordenación.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [] primerArray = {6,3,2,9,7,8};
        int [] primerArray2 = {2,4,6,4,7,1};
        int [] arrayOrdenado = new int[6];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < primerArray.length; j++) {
                if (i == primerArray[i]){
                    arrayOrdenado[j] = i;
                }
            }
            System.out.println(arrayOrdenado);
        }
    }
}
