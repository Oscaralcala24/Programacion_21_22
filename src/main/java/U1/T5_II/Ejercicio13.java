package U1.T5_II;

//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeroIntroducido = teclado.nextInt();
        boolean par = false;
        boolean divisible5 = false;
        if (numeroIntroducido%2==0){
            par = true;
        }
        if (numeroIntroducido%5==0){
            divisible5 = true;
        }
        if ((par==true)&&(divisible5==true)){
            System.out.println("Es par y divisible entre 5.");
        }else if ((par==false)&&(divisible5==true)){
            System.out.println("No es par y divisible entre 5.");
        }else if ((par==true)&&(divisible5==false)){
            System.out.println("Es par y no es divisible entre 5.");
        }else {
            System.out.println("No es par y no es divisible entre 5.");
        }
    }
}
