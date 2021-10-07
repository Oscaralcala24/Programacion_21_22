package U3.T1;

//Diseñar una función eco() a la que se le pasa como parámetro un número n,
// y muestra por pantalla n veces el mensaje "Eco..."

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeroIntroducido = sc.nextInt();
        eco(numeroIntroducido);
    }
    static void eco(int numero){
        for (int i = 0; i < numero; i++) {
            System.out.println("Eco...");
        }
    }
}
