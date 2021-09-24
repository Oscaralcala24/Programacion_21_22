package U1.T7;

//Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos".
// Necesitamos almacenar en la variable booleana "jasp" el valor:
//
//verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3,
// y los ingresos superan los 28000 (euros).
//falso.
// En caso contrario, escribe el código necesario para inicializar "jasp" en una línea.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt();
        System.out.print("Introduce nivel de estudios: ");
        int nivelEstudios = teclado.nextInt();
        System.out.print("Introduce ingresos: ");
        int ingresos = teclado.nextInt();
        boolean jasp = true;
        if ((edad<=28) && (nivelEstudios>3) && (ingresos>28000)) {
            jasp = true;
            System.out.println("Joven Aunque Sobradamente Preparado: "+jasp);
        } else {
            jasp = false;
            System.out.println("Joven Aunque Sobradamente Preparado: "+jasp);
        }
    }
}
