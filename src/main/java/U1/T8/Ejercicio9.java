package U1.T8;

//Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
// Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
// Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce altura del arbol: ");
        double arbolIntroducido = teclado.nextDouble();
        double arbolMayorAltura = 0;
        int contadorArboles = 0;
        while (arbolIntroducido!=-1){
            if (arbolIntroducido>arbolMayorAltura){
                arbolMayorAltura = arbolIntroducido;

            }
            contadorArboles++;
            System.out.println("Introduce altura del arbol: ");
            arbolIntroducido = teclado.nextDouble();
        }
        System.out.println("El arbol mas alto es el numero "+contadorArboles+" midiendo "+arbolMayorAltura+" cm");
    }
}
