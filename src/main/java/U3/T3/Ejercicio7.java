package U3.T3;

//Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
// Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre,
// luego, las del segundo, y luego, las del tercero. Debemos mostrar, al final, la nota media del grupo en cada trimestre,
// y la media del alumno que se encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por trimestre-,
// o usando una matriz bidimensional en la que las filas sean los trimestres y las columnas los alumnos).

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero del alumno: ");
        int pos = sc.nextInt();
        System.out.println("Notas del primer trimestre");
        int [] primerTrimestre = (int[]) IntroducirNotas(sc);
        System.out.println("Notas del segundo trimestre");
        int [] segundoTrimestre = (int[]) IntroducirNotas(sc);
        System.out.println("Notas del tercer trimestre");
        int [] tercerTrimestre = (int[]) IntroducirNotas(sc);
        System.out.println("La media del primer trimestre es: "+ calcularMedia(primerTrimestre));
        System.out.println("La media del primer trimestre es: "+ calcularMedia(segundoTrimestre));
        System.out.println("La media del primer trimestre es: "+ calcularMedia(tercerTrimestre));
        double mediaAlumno = (primerTrimestre[pos-1]+segundoTrimestre[pos-1]+tercerTrimestre[pos-1])/3;

        System.out.println("La media del alumno " + pos + " es: " + mediaAlumno);
    }

    private static double calcularMedia(int[] trimestre) {
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + trimestre[i];
        }
        suma /=5;
        return suma;
    }

    private static int[] IntroducirNotas(Scanner sc) {
        int numeroAlumnos = 5;
        int [] arrayDevolver = new int[numeroAlumnos];
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.print("Introduce nota del alumno "+(i+1)+":");
            arrayDevolver[i] = sc.nextInt();
        }
        return arrayDevolver;
    }
}
