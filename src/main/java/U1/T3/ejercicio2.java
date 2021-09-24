package U1.T3;

//Crea un programa que pida al usuario su año de nacimiento y el año actual
// (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce año de nacimiento: ");
        short  anoNacimiento = teclado.nextShort();
        System.out.println("Introduce año actual: ");
        short  anoActual = teclado.nextShort();
        System.out.println("Usted tiene "+(anoActual-anoNacimiento)+" años");
    }
}
