package U1.T8b;

import java.util.Scanner;

public class Ejercicio1 {
    private static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce combinacion secreta: ");
        int numeroIntroducido = teclado.nextInt();
        int combinacionSecreta = 7584;
        int contadorIntentos =4;
        while (numeroIntroducido!=combinacionSecreta){
            contadorIntentos--;
            System.out.println("Combinacion incorrecta, le quedan "+contadorIntentos+" intentos, vuelve a introducir el codigo: ");
            numeroIntroducido = teclado.nextInt();
            if (contadorIntentos==1){
                break;
            }
            if (numeroIntroducido == combinacionSecreta){
                System.out.println("Numero correcto, caja fuerta abierta!");
            }
        }
    }
}
