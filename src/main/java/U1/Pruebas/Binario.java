package U1.Pruebas;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para pasarlo a binario: ");
        long numeroIntroducido = sc.nextLong();
        long resto = 0;
        long numAux = 0;
        long binario = 0;
        int contador = 0;

        while (numeroIntroducido>0){
           resto = numeroIntroducido % 2;
           binario = (long) (binario + resto * Math.pow(10, contador));
           numeroIntroducido = numeroIntroducido/2;
           contador++;
        }
        System.out.print(binario);
        }
    }
