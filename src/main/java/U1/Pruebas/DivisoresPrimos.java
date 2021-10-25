package U1.Pruebas;

import java.util.Scanner;

public class DivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeroIntroducido = sc.nextInt();
        int contadorPrimos = 0;


        for (int i = 2; i < numeroIntroducido; i++) {
            boolean esPrimo = true;
            if (numeroIntroducido%i==0){
                for (int j = 2; j < i; j++) {
                    if (i%j == 0){
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo){
                    contadorPrimos++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(contadorPrimos);
    }
}
