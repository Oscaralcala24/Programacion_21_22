package U1.T5;

//Crea un programa que pida un número entero al usuario y diga si
// es positivo (mayor que cero) o si, por el contrario, no lo es (usando "else").

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero entero: ");
        int numero1 = teclado.nextInt();
        if (numero1>=0) {
            System.out.print("El numero introducido es mayor o igual a 0");
        } else {
            System.out.print("El numero introducido es menor a 0");
        }

    }
}
