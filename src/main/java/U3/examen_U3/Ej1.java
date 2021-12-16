package U3.examen_U3;

//Crea una función con la siguiente cabecera:
//
//public static boolean esPuntoDeSilla(int x[][], int i, int j)
//Que devuelve true si un número en una determinada posición de una matriz, es punto de silla.
// El punto de silla cumple la condición de ser el mínimo en su fila y máximo en su columna.
//
//Desde el programa principal se debe pedir al usuario un número de filas y de columnas,
// y generar una matriz de números enteros aleatorios entre 11 y 1003 con el tamaño introducido por el usuario.
// Llamará a la función para comprobar si cada uno de sus elementos es punto de silla.

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las filas del array: ");
        int filas = sc.nextInt();
        System.out.print("Introduce las columnas del array: ");
        int columnas = sc.nextInt();
        int [][]arrayX = new int[filas][columnas];
        rellenarArray(arrayX);
        System.out.println();
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                if (esPuntoDeSilla(arrayX, i,j)){
                    System.out.println(arrayX[i][j] + " Es punto de silla");
                }else {
                    System.out.println(arrayX[i][j] + " No es punto de silla");
                }
            }
        }
    }

    private static boolean esPuntoDeSilla(int[][] x, int i, int j) {
        boolean minimoFila = true;
        boolean mayorColumna = true;
        boolean puntoDeSilla = false;
        for (int k = 0; k < x[i].length; k++) {
            if (x[i][j] > x[i][k]){
                minimoFila = false;
            }
        }
        for (int k = 0; k < x.length; k++) {
            if (x[i][j] < x[k][j]){
                mayorColumna = false;
            }
        }
        if ( minimoFila && mayorColumna){
            puntoDeSilla = true;
        }
        return puntoDeSilla;
    }

    private static void rellenarArray(int[][] arrayX) {
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                arrayX[i][j] = (int) (11 + Math.random() * 993);
                System.out.print(" || "+arrayX[i][j]+" || ");
            }
            System.out.println();
        }
    }
}
