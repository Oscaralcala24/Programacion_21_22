package U3.T4;

//Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
// podría saltar un alfil que se encuentra en esa posición.
// Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas.
// Las columnas se indican con las letras de la a a la h y las filas se indican del 1 al 8.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la posicion del alfil: ");
        String posicionAlfil = sc.nextLine();
        String[][] tablero = new String[8][8];
        rellenatablero(tablero);
        int fila = getFila(posicionAlfil);
        int columna = Integer.parseInt(posicionAlfil.substring(1));
        System.out.println("El alfil puede moverse a las siguientes posiciones: ");
        comprobarArribaDerecha(fila, columna,posicionAlfil);
        System.out.println();
        comprobarArribaIzquierda (fila,columna,posicionAlfil);
        System.out.println();
        comprobarAbajoDerecha (fila,columna,posicionAlfil);
        System.out.println();
        comprobarAbajoIzquierda (fila,columna,posicionAlfil);
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                System.out.print(" | "+tablero[i][j]+ " | ");
            }
            System.out.println();
        }

    }

    private static void comprobarAbajoIzquierda(int fila, int columna, String posicionAlfil) {
        if ((fila >= 1) && (fila <= 8 ) && (columna >= 1 ) && (columna <= 8)){
            if (!posicionAlfil.equalsIgnoreCase(getFilaLetra(fila)+columna)){
                System.out.print(getFilaLetra(fila)+columna+" ");
            }
            comprobarAbajoDerecha(fila-1, columna-1,".");
        }
    }

    private static void comprobarAbajoDerecha(int fila, int columna, String posicionAlfil) {
        if ((fila >= 1) && (fila <= 8 ) && (columna >= 1 ) && (columna <= 8)){
            if (!posicionAlfil.equalsIgnoreCase(getFilaLetra(fila)+columna)){
                System.out.print(getFilaLetra(fila)+columna+" ");
            }
            comprobarAbajoDerecha(fila-1, columna+1, ".");
        }

    }

    private static void comprobarArribaIzquierda(int fila, int columna, String posicionAlfil) {
        if ((fila >= 1) && (fila <= 8 ) && (columna >= 1 ) && (columna <= 8)){
            if (!posicionAlfil.equalsIgnoreCase(getFilaLetra(fila)+columna)){
                System.out.print(getFilaLetra(fila)+columna+" ");
            }
            comprobarArribaIzquierda(fila+1, columna-1, ".");
        }

    }

    private static void comprobarArribaDerecha(int fila, int columna, String posicionAlfil) {
        if ((fila >= 1) && (fila <= 8 ) && (columna >= 1 ) && (columna <= 8)) {
            if (!posicionAlfil.equalsIgnoreCase(getFilaLetra(fila)+columna)){
                System.out.print(getFilaLetra(fila)+columna+" ");
            }
            comprobarArribaDerecha(fila+1, columna+1, ".");
        }


}

    private static int getFila(String posicionAlfil) {
        int columnaDevolver = 0;
        switch (posicionAlfil.charAt(0)){
            case 'a': columnaDevolver = 1; break;
            case 'b': columnaDevolver = 2; break;
            case 'c': columnaDevolver = 3; break;
            case 'd': columnaDevolver = 4; break;
            case 'e': columnaDevolver = 5; break;
            case 'f': columnaDevolver = 6; break;
            case 'g': columnaDevolver = 7; break;
            case 'h': columnaDevolver = 8; break;
        }
        return columnaDevolver;
    }
    private static String getFilaLetra(int posicionAlfil) {
        String columnaDevolverLetra =  "";
        switch (posicionAlfil){
            case 1: columnaDevolverLetra = String.valueOf('a'); break;
            case 2: columnaDevolverLetra = String.valueOf('b'); break;
            case 3: columnaDevolverLetra = String.valueOf('c'); break;
            case 4: columnaDevolverLetra = String.valueOf('d'); break;
            case 5: columnaDevolverLetra = String.valueOf('e'); break;
            case 6: columnaDevolverLetra = String.valueOf('f'); break;
            case 7: columnaDevolverLetra = String.valueOf('g'); break;
            case 8: columnaDevolverLetra = String.valueOf('h'); break;
        }
        return columnaDevolverLetra;
    }

    private static void rellenatablero(String[][] tablero) {
        int contadorTablero = 7;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[contadorTablero][j] = getFilaLetra(j+1)+(i+1);
            }
            contadorTablero--;
        }
    }
}
