package U1.Pruebas;

import java.util.Scanner;

public class Quitar0y8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeroIntroducido= sc.nextInt();
        System.out.println("Introduce posicion inicial: ");
        int posicionInicial = sc.nextInt();
        System.out.println("Introduce posicion final: ");
        int posicionFinal = sc.nextInt();
        int resto;
        int contadorLongitud = 0;
        int numAux = 0;
        while (numeroIntroducido>0){
            resto = numeroIntroducido%10;
            numeroIntroducido = numeroIntroducido/10;
            numAux = numAux + resto;
            numAux = numAux*10;

        }
        numAux = numAux/10;

        while (numAux>0){
            resto = numAux%10;
            numAux = numAux/10;
            if ((contadorLongitud<posicionInicial) || (contadorLongitud>posicionFinal)){
                numeroIntroducido = numeroIntroducido + resto;
                numeroIntroducido = numeroIntroducido*10;
            }
            contadorLongitud++;
        }

        System.out.println(numeroIntroducido/10);
    }

}

