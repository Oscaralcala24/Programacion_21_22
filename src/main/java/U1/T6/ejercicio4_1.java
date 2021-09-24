package U1.T6;

import java.util.Scanner;

public class ejercicio4_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        byte numero1 = teclado.nextByte();
        System.out.print("Introduce segundo numero: ");
        byte numero2 = teclado.nextByte();
        byte menor = (numero1>numero2)?numero1:numero2;
        System.out.println("El numero mas grande es: " + menor);
    }
}
