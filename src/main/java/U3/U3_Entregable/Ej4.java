package U3.U3_Entregable;

//Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente prototipo:
//
//public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
//Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y una posición.
// Devolverá como resultado un
// array bidimensional en el que esté insertado como una nueva fila en la matriz el array en la posición que se
// indica.
//
//Se deberá imprimir la matriz antes y después de insertar la fila.
//
//NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario comprobarlo,
// como tampoco es necesario comprobar que la posición pasada es válida, se entenderá que el usuario pasa
// una posición válida.

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        String[][] matriz = {
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"}
        };
        String [] fila =  {"j","k","l"};
        mostrarArray(matriz);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una posicion: ");
        int pos = sc.nextInt();
        matriz = insertarFilaEnMatriz(matriz,fila,pos);
        mostrarArray(matriz);
    }

    private static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        String[][] matrizAux = new String[matriz.length+1][matriz[0].length];
        int indiceFila = 0;
        for (int i = 0; i < pos; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                matrizAux[i][j] = matriz [i][j];

            }
            indiceFila++;
        }
        for (int i = 0; i < fila.length; i++) {
            matrizAux[pos][i] = fila[i];
        }
        indiceFila++;
        for (int i = 0; i < matriz.length-pos; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                matrizAux[indiceFila][j] = matriz[pos+i][j];
            }
            indiceFila++;
        }
        return matrizAux;
    }

    private static void mostrarArray(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" || "+matriz[i][j]+" || ");
            }
            System.out.println();
        }
    }
}
