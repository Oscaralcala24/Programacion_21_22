package U3.Pruebas;

//Crea la función filtraPrimos que:
//
//Recibe un array de enteros
//Devuelve un array de enteros con todos los primos que se encuentran en el array origen
//Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
// Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector.
// Si no existe ningún número primo en el vector original, se devuelve un array con el número -1 como único elemento.

import java.util.Arrays;

public class EjercicioEntregable1 {
    public static void main(String[] args) {
        int [] arrayEnteros = {2,3,5,6,7,7,9,10,12};

        System.out.println(Arrays.toString(getPrimos(arrayEnteros)));
        
    }

    private static int[] getPrimos(int[] arrayEnteros) {
        int contadorPosiciones = 1;
        int[] arrayPrimos = new int[0];
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (comprobarPrimos(arrayEnteros[i])){
                arrayPrimos = Arrays.copyOf(arrayPrimos, contadorPosiciones);
                arrayPrimos[contadorPosiciones-1]=arrayEnteros[i];
                contadorPosiciones++;

            }
        }
        if (contadorPosiciones==0) {
            Arrays.copyOf(arrayPrimos, 1);
            arrayPrimos[0] = -1;
        }
        return arrayPrimos;
    }

    private static boolean comprobarPrimos(int numeroEntero) {
        boolean esPrimo = true;
        for (int i = 2; i < numeroEntero; i++){
            if (numeroEntero%i==0){
                esPrimo=false;
                break;
            }
            if (numeroEntero==2){
                esPrimo=true;
            }
        }
        return esPrimo;
    }
}
