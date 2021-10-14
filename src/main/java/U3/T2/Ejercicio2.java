package U3.T2;

//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando
// las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra introducida sea
// "fin" escrita con cualquier combinación de mayúsculas/minúsculas.
// La cadena "fin" no aparecerá en la frase final.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String espacio = " ";
        String palabra = "";
        String frase = "";
        while (!palabra.equalsIgnoreCase("fin")){
            frase = frase+espacio+palabra;
            System.out.print("Introduce una palabra: ");
            palabra = sc.next();
        }
        System.out.println(frase);
    }
}
