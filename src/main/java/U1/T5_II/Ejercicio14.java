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
        System.out.print("Introduce una altura: ");
        int altura = teclado.nextInt();
        System.out.print("Introduce direccion del vertice. (arriba, abajo, izquierda, derecha): ");
        String direccion = teclado.next().toLowerCase();
        switch (direccion){
            case "arriba" :
                for (int i = 0; i < altura; i++) {
                    for (int blancos = 1; blancos < altura-i; blancos++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 0; asteriscos <=i*2; asteriscos++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
            case "abajo" :
                for (int i = 1; i <= altura; i++) {
                    for (int blancos = 1; blancos < i; blancos++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 0; asteriscos <=altura*2-i*2; asteriscos++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
            case "izquierda":
                for (int i = 0; i < ; i++) {
                    
                }
        }
    }
}
