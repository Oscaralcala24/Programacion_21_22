package U1.T2;

//Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
// y calcule su equivalencia en metros (1 milla = 1609 m).

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero de millas: ");
        int numeroMillas = teclado.nextInt();
        int numeroMetros = numeroMillas*1609;
        System.out.println("El resultado en metros es: "+numeroMetros+" metros");
    }
}
