package U3.T1;

//Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para saber sus divisores que son primos: ");
        int numeroIntroducido = sc.nextInt();
        divisoresPrimos(numeroIntroducido);
    }

    private static void divisoresPrimos(int num) {
        for (int i = 2; i < num; i++) {
            boolean esPrimo = true;
            if (num % i == 0){
                for (int j = 2; j < i; j++) {
                    if (i%j==0){
                        esPrimo=false;
                        break;
                    } else {
                        esPrimo=true;
                    }
                }
                if (esPrimo==true){
                    System.out.println(i);
                }
            }
        }
    }
}
