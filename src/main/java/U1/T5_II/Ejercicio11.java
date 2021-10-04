package U1.T5_II;

//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
// Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
// Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
// en las diferentes asignaturas del curso.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador=0;
        int respuesta;
        System.out.println("Elige la respuesta correcta.");
        for (int i = 1; i <=10 ; i++) {
            switch (i){
                case 1:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==2){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 2:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==3){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 3:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==3){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 4:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==1) {
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 5:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==3){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 6:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==2){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 7:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==2){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 8:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==2){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 9:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==1){
                        contador++;
                        break;
                    }else{
                        break;
                    }
                case 10:
                    System.out.println("¿aaaaaaaaaaaaaaaaaaa?");
                    System.out.println("1.bbbbbbbbb");
                    System.out.println("2.nnnnnnnnn");
                    System.out.println("3.ccccccccc");
                    respuesta = teclado.nextInt();
                    if (respuesta==1){
                        contador++;
                        break;
                    }else{
                        break;
                    }
            }
        }
        System.out.println("La calificacion total obtenida es de: "+contador+" puntos");
    }
}
