package U3.T4;

//Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
// podría saltar un alfil que se encuentra en esa posición.
// Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas.
// Las columnas se indican con las letras de la a a la h y las filas se indican del 1 al 8.

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la posicion del alfil: ");
        String posicionAlfil = sc.nextLine();
        int [][] tablero = new int[8][8];
        rellenatablero(tablero);
        int fila = getFila(posicionAlfil);
        int columna = Integer.parseInt(posicionAlfil.substring(1));
        System.out.println(fila+" "+columna);
    }

    private static int getFila(String posicionAlfil) {
        int filaDevolver = 0;
        switch (posicionAlfil.charAt(0)){
            case 'a': filaDevolver = 1;
            case 'b': filaDevolver = 2;
            case 'c': filaDevolver = 3;
            case 'd': filaDevolver = 4;
            case 'e': filaDevolver = 5;
            case 'f': filaDevolver = 6;
            case 'g': filaDevolver = 7;
            case 'h': filaDevolver = 8;
        }
        return filaDevolver;
    }

    private static void rellenatablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]= j+1;
            }
        }
    }
}
