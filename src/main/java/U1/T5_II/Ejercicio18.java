package U1.T5_II;

//Calcula la nota de un trimestre de la asignatura Programación.
// El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
// Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media.
// En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación
// que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la
// recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario,
// se  mantiene la nota media anterior.
//
//
//Ejemplo 1:
//Nota del primer control: 7
//Nota del segundo control: 10
//Tu nota de Programación es 8.5
//Ejemplo 2:
//Nota del primer control: 6
//Nota del segundo control: 3
//¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
//Tu nota de Programación es 5
//Ejemplo 3:
//Nota del primer control: 6
//Nota del segundo control: 3
//¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
//Tu nota de Programación es 4.5

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce nota del primer examen: ");
        double examen1 = teclado.nextDouble();
        System.out.print("Introduce nota del segundo examen: ");
        double examen2 = teclado.nextDouble();
        double mediaExamenes = (examen1+examen2)/2;
        if (mediaExamenes>=5){
            System.out.println("Tu nota de Programación es: "+mediaExamenes);
        }else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            String recuperacion = teclado.next();
            boolean apto = (recuperacion.equalsIgnoreCase("apto"))?true:false;
            if (apto== true){
                mediaExamenes=5;
                System.out.println("Tu nota de Programación es: "+mediaExamenes);
            }else {
                System.out.println("Tu nota de Programación es: "+mediaExamenes);
            }
        }
    }
}
