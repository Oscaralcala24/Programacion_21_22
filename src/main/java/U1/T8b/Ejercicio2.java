package U1.T8b;

//Escribe un programa que muestre en tres columnas, el cuadrado y
// el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numeroIntroducido = teclado.nextInt();
        int numeroAux = numeroIntroducido+5;

        while (numeroIntroducido<=numeroAux){
            int numeroCuadrado = (int) Math.pow(numeroIntroducido,2);
            int numeroCubo = (int) Math.pow(numeroIntroducido,3);
            System.out.print(numeroIntroducido+" "+numeroCuadrado+" "+numeroCubo+"\n");
            numeroIntroducido++;
        }
    }
}
