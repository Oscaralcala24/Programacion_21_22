package U1.T8;

//Diseñar un programa que muestre, para cada número introducido por teclado,
// si es par, si es positivo, y su cuadrado. El proceso terminará
// cuando el número introducido por teclado sea 0.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        while (numero!=0){
            boolean par = (numero%2==0)?true:false;
            boolean positivo = (numero>=0)?true:false;
            int numeroCuadrado = (int) Math.pow(numero,2);
            System.out.println("Su cuadrado es: "+numeroCuadrado);
            if (par==true){
                System.out.println("Es par");

            } else{
                System.out.println("Es impar");
            }
            if (positivo==true){
                System.out.println("Es positivo" );
            } else{
                System.out.println("Es negativo" );
            }
            System.out.println("Introduce otro numero: ");
            numero = teclado.nextInt();
        }
    }
}
