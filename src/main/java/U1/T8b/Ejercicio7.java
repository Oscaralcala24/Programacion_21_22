package U1.T8b;

//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numeroIntroducido = teclado.nextInt();
        int numeroInvertido = 0;
        int resto = 0;
        while (numeroIntroducido>0){
            resto =  numeroIntroducido%10;
            numeroInvertido=numeroInvertido*10+resto;
            numeroIntroducido = numeroIntroducido/10;

        }
        System.out.println(numeroInvertido);

    }
}
