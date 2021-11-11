package U3.T3;

//Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
// Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera,
// de forma que los 12 números sigan ordenados.
// Fusionar significa copiar en el orden correcto para que los datos resultantes continúen
// ordenados sin necesidad de volver a realizar una ordenación.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int []primerArray = {2,4,5,9,2,7};
        int []segundoArray = {8,3,2,7,1,3};
        int []arrayOrdenado = new int [primerArray.length + segundoArray.length];
        System.arraycopy(primerArray,0,arrayOrdenado,0,primerArray.length);
        System.arraycopy(segundoArray,0,arrayOrdenado,segundoArray.length,segundoArray.length);
        ordenarArrays(primerArray);
        ordenarArrays(segundoArray);
        ordenarArrays(arrayOrdenado);
    }

    private static void ordenarArrays(int[] arrays) {
        boolean ordenado = false;
        while (ordenado == false){
            int contadorCambios = 0;
            for (int i = 0; i < arrays.length-1; i++) {
                if (arrays[i] > arrays[i+1]){
                    int numAUX = arrays[i];
                    arrays[i] = arrays[i+1];
                    arrays[i+1] = numAUX;
                    contadorCambios ++;
                }
            }
            if (contadorCambios == 0){
                ordenado = true;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
