package U3.Pruebas;

//Hacer una algoritmo que solicite al usuario una cifra N y
// rellene un array bidimensional de N filas y N columnas con número aleatorios entre 100 y 200.
//
//Mostrar dicho array y a continuación rotarlo 90 grados:

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioEntregable3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dimension: ");
        int N = sc.nextInt();
        int [][] tablaAleatoria = new int[N][N];
        rellenarArray(tablaAleatoria);
        int [][] arrayAux = new int[N][N];
        mostrarTabla(tablaAleatoria);
        System.out.println();
        mostrarTabla(girarArray(arrayAux, tablaAleatoria));
    }

    private static int[][] girarArray(int[][] arrayAux, int[][] tablaAleatoria) {
        for (int i = 0; i < arrayAux.length; i++) {
            for (int j = 0; j < arrayAux[i].length; j++) {
                    arrayAux[j][arrayAux.length-i-1] = tablaAleatoria[i][j];
            }
        }
        return arrayAux;
    }

    private static void mostrarTabla(int[][] tablaAleatoria) {
        for (int i = 0; i < tablaAleatoria.length; i++) {
            for (int j = 0; j < tablaAleatoria[i].length; j++) {
                System.out.print(" | "+ tablaAleatoria[i][j] +" | ");
            }
            System.out.println();
        }
    }

    private static void rellenarArray(int[][] tablaAleatoria) {
        for (int i = 0; i < tablaAleatoria.length; i++) {
            for (int j = 0; j < tablaAleatoria[i].length; j++) {
                tablaAleatoria[i][j] = (int) (100+Math.random()*101);
            }
        }
    }
}
