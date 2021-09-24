package U1.T5;

//Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce segundo numero: ");
        int numero2 = teclado.nextInt();
        int contadorPar = 0;
        if (numero1%2==0){
            contadorPar ++;
        }
        if (numero2%2==0){
            contadorPar ++;
        }
        System.out.println("El numero de pares es: "+contadorPar);
    }
}
