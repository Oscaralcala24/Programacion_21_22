package U1.T8;

// Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.print(i);
        }
    }
}
