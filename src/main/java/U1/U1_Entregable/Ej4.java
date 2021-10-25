package U1.U1_Entregable;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número de 6 cifras: ");
        long numeroIntroducido = sc.nextLong();
        long numeroAux = 0;
        int resto = 0;
        int primerasCifras = 0;
        int ultimasCifras = 0;
        int contador = 0;
        boolean esPrimo = false;
        while ((numeroIntroducido >= 1000000) || (numeroIntroducido <= 99999)) {
            System.out.print("Vuelve a introducir el numero: ");
            numeroIntroducido = sc.nextLong();
        }

        while (numeroIntroducido > 0) {
            resto = (int) (numeroIntroducido % 10);
            numeroIntroducido = numeroIntroducido / 10;
            numeroAux = (numeroAux + resto) * 10;

        }
        numeroAux /= 10;
        System.out.println(numeroAux);
        while (numeroAux > 0) {
            resto = (int) (numeroAux % 10);
            numeroAux = numeroAux / 10;

            if (contador < 3) {
                primerasCifras = primerasCifras + resto;
                primerasCifras = primerasCifras*10;
            } else {
                ultimasCifras = ultimasCifras + resto;
                ultimasCifras = ultimasCifras * 10;
            }
            contador++;
        }
        primerasCifras/=10;
        ultimasCifras/=10;
        for (int i = 2; i < primerasCifras; i++) {
            if (primerasCifras%i == 0){
                esPrimo = true;
                break;
            }
        }
        if (esPrimo){
            System.out.println(primerasCifras+" NO es un numero primo");
        }else {
            System.out.println(primerasCifras+" es un numero primo");
        }

        esPrimo=false;
        for (int i = 2; i < ultimasCifras; i++) {
            if (ultimasCifras%i == 0){
                esPrimo = true;
                break;
            }
        }
        if (esPrimo){
            System.out.println(ultimasCifras+" NO es un numero primo");
        }else {
            System.out.println(ultimasCifras+" es un numero primo");
        }
    }
}

