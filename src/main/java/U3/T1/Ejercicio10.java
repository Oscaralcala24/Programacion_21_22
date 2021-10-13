package U3.T1;

//Escribir una función que decida si dos números enteros positivos son amigos. Dos números son amigos
// si la suma de los divisores propios (distinto de él mismo) del primer número es igual al segundo número, y viceversa.
// Ejemplos: (220 - 284), (1184 - 1210)

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int numeroIntroducido1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int numeroIntroducido2 = sc.nextInt();
        if (sumaDivisores(numeroIntroducido1,numeroIntroducido2)==true){
            System.out.println("Son amigos");
        }else {
            System.out.println("No son amigos");
        }
    }

    private static boolean sumaDivisores(int num1, int num2) {
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1%i==0){
                suma1=i+suma1;
            }
        }
        for (int i = 1; i < num2 ; i++) {
            if (num2%i==0){
                suma2=i+suma2;
            }
        }
        return sonAmigos(suma1,suma2,num1,num2);
    }

    private static boolean sonAmigos(int suma1, int suma2, int num1, int num2) {
        boolean amigos = false;
        if ((suma1==num2) && (suma2==num1)){
            amigos=true;
        }
        return amigos;
    }
}
