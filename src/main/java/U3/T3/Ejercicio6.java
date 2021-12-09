package U3.T3;

// Implementar una función sinRepetidos() con el prototipo:
//
//int[] sinRepetidos(int t[])
//
//que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] sinRepetidos = {2,2,5,6,9,9,8};
        ;
        System.out.println(Arrays.toString(sinRepetidos(sinRepetidos)));
    }

    private static int[] sinRepetidos(int[] sinRepetidos) {
        int [] arrayAux = new int[0];
        for (int i = 0; i < sinRepetidos.length; i++) {
            if (!comprobarRepetido(sinRepetidos[i], arrayAux)){
                arrayAux = Arrays.copyOf(arrayAux, arrayAux.length+1);
                arrayAux[arrayAux.length-1] = sinRepetidos[i];
            }
        }
        return arrayAux;
    }

    private static boolean comprobarRepetido(int sinRepetido, int[] arrayAux) {
        boolean seRepite = false;
        for (int i = 0; i < arrayAux.length; i++) {
            if (sinRepetido == arrayAux[i]){
                seRepite = true;
            }
        }

        return seRepite;
    }
}
