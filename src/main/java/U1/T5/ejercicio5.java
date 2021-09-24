package U1.T5;

//Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        long numero1 = teclado.nextLong();
        System.out.print("Introduce segundo numero: ");
        long numero2 = teclado.nextLong();
        System.out.print("Introduce tercer numero: ");
        long numero3 = teclado.nextLong();
        if ((numero1>numero2) && (numero1>numero3)){
            System.out.println(numero1+" es el numero mas grande");
        } else if ((numero2>numero3) && (numero2>numero1)) {
            System.out.println(numero2 + " es el numero mas grande");
        } else {
            System.out.println(numero3 + " es el numero mas grande");
        }
    }
}
