package U1.T8b;

//Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido;
        int contadorPositivos=0;
        int contadorNegativos=0;
        for (int i = 10; i > 0; i--) {
            System.out.print(i+"- Introduce un  numero: ");
            numeroIntroducido = teclado.nextInt();
            boolean positivo = (numeroIntroducido>=0)?true:false;
            if (positivo==true){
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
        }
        System.out.println("Hay "+contadorPositivos+" positivos y "+contadorNegativos+" negativos");
    }
}
