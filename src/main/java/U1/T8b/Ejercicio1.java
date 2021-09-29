package U1.T8b;

//Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
// El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
// “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
// Tendremos cuatro oportunidades para abrir la caja fuerte.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
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
