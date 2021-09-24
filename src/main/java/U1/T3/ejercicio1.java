package U1.T3;

//Crea un programa que calcule y muestre la suma de dos números
// de dos cifras (de tipo byte) que introduzca el usuario.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer numero: ");
        byte  numero1 = teclado.nextByte();
        System.out.println("Introduce segundo numero numero: ");
        byte  numero2 = teclado.nextByte();
        System.out.println("El resultado es :"+(numero1+numero2));
    }
}
