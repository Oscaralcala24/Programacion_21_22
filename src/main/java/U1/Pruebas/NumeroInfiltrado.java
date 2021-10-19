package U1.Pruebas;

import java.util.Scanner;

public class NumeroInfiltrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero que quieres insertar: ");
        long numeroIntroducido = teclado.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = teclado.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digitoIntroducir = teclado.nextInt();

        long cociente = numeroIntroducido;
        long resto = 0;
        long numeroAux = 0;
        int contador = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAux = numeroAux + resto;
            numeroAux = numeroAux * 10 ;

        }

        while (numeroAux > 0){
            resto = numeroAux % 10;
            numeroAux = numeroAux /10;
            cociente = cociente + resto;
            cociente = cociente * 10 ;
            if (contador==posicion){
                cociente = cociente + digitoIntroducir;
                cociente = cociente * 10 ;
            }
            contador++;
        }
        System.out.print(cociente/10);
    }
}

