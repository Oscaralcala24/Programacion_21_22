package U1.T5_II;

//Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra,
// un número o un símbolo como *, +, -, $, &,etc.
// El programa debe permitir al usuario mediante un menú elegir si el vértice
//de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);
        System.out.print("Introduce direccion del vertice");
    }
}
