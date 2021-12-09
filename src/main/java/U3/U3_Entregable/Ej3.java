package U3.U3_Entregable;

//Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y columnas
// como indique el usuario.
// Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos incluidos).
//
//A continuación, el programa debe insertar en un array pares los números que se encuentran
// en la intersección de las filas pares con las columnas pares. Se hace lo mismo para el array impares
// con los números que se encuentran en la intersección de las filas impares con las columnas impares.
//
//Finalmente se debe mostrar la matriz de números, el array de números pares, el de números impares,
// y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Introduce numero de columnas: ");
        int columnas = sc.nextInt();
        int[][] array = new int[filas][columnas];
        rellenarArray(array);
        int[] interseccionPar = new int[0];
        int[] interseccionImpar = new int[0];
        interseccionPar = getPares(array,interseccionPar);
        System.out.println("Pares: "+Arrays.toString(interseccionPar));
        interseccionImpar = getImpar(array,interseccionImpar);
        System.out.println("Impares: "+ Arrays.toString(interseccionImpar));
        datosPares(interseccionPar);
        datosImpares(interseccionImpar);
    }

    private static void datosImpares(int[] interseccionImpar) {
        int suma = 0;
        int media = 0;
        int maximo = interseccionImpar[0];
        int minimo = interseccionImpar[0];
        for (int i = 0; i < interseccionImpar.length; i++) {
            suma = suma + interseccionImpar[i];
            if (interseccionImpar[i]>maximo){
                maximo = interseccionImpar[i];
            }
            if (interseccionImpar[i]<minimo){
                minimo = interseccionImpar[i];
            }
        }
        System.out.println("Suma de Impares : "+suma);
        System.out.println("Media de Impares : "+suma/interseccionImpar.length);
        System.out.println("Maximo de Impares : "+maximo);
        System.out.println("Minimo de Impares : "+minimo);
    }

    private static void datosPares(int[] interseccionPar) {
        int suma = 0;
        int media = 0;
        int maximo = interseccionPar[0];
        int minimo = interseccionPar[0];
        for (int i = 0; i < interseccionPar.length; i++) {
            suma = suma + interseccionPar[i];
            if (interseccionPar[i]>maximo){
                maximo = interseccionPar[i];
            }
            if (interseccionPar[i]<minimo){
                minimo = interseccionPar[i];
            }
        }
        System.out.println("Suma de pares : "+suma);
        System.out.println("Media de pares : "+suma/interseccionPar.length);
        System.out.println("Maximo de pares : "+maximo);
        System.out.println("Minimo de pares : "+minimo);
    }


    private static int[] getImpar(int[][] array, int[] interseccionImpar) {
        int indiceImpar = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i%2 != 0 && j%2 != 0){
                    indiceImpar++;
                    interseccionImpar = Arrays.copyOf(interseccionImpar,indiceImpar);
                    interseccionImpar[indiceImpar-1] = array[i][j];
                }
            }
        }
        return interseccionImpar;
    }

    private static int[] getPares(int[][] array, int[] interseccionPar) {
        int indicePar = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i%2 == 0 && j%2 == 0){
                    indicePar++;
                    interseccionPar = Arrays.copyOf(interseccionPar,indicePar);
                    interseccionPar[indicePar-1] = array[i][j];
                }
            }
        }
        return interseccionPar;
    }

    private static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= (int) (14 + Math.random()*65);
                System.out.print(" || "+array[i][j]+" || ");
            }
            System.out.println();
        }
    }
}
