package U3.Pruebas;

//Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional
// en la posición n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo.
// El primer elemento es el 0.
//
//Si la posición donde se busca no existe en el array, la función debe devolver -1.
//
//Se debe entregar tanto el código de la función como el código de prueba que la usa.
// Rellenaremos los arrays de manera aleatorio con números entre 10 y 100 (ambos incluidos).

import java.util.Scanner;

public class ej4_2021_MANANA_AZUL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Siendo el array el que se muestra a continuancion:");
        int [][] n = new int[4][6];
        rellenarArray(n);
        System.out.print("Dime la posicion: ");
        int posicion = sc.nextInt();
        System.out.println(nEsimo(n, posicion));
    }

    private static int nEsimo(int[][] n, int posicion) {
        int numeroAux = 0;
        int numeroDevolver = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (numeroAux == posicion){
                    numeroDevolver = n[i][j];
                }
                numeroAux++;

            }
        }
        return numeroDevolver;
    }

    private static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (10 + Math.random() * 91);
                System.out.print(" || "+array[i][j]+" || ");
            }
            System.out.println();
        }
    }
}
