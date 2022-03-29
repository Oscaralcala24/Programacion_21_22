package U7.Repaso_2021_Manana;

import java.io.Serializable;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Maraton maraton1 = new Maraton();
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("Elige una de las opciones del menu:");
            System.out.println("1. Cargar Atletas");
            System.out.println("2. Guardar Atletas");
            System.out.println("3. Inscribir Atletas");
            System.out.println("4. Guardar Tiempo Atleta");
            System.out.println("5. Borrar Atleta");
            System.out.println("6. Mostrar lista atletas que han finalizado");
            System.out.println("7. Mostrar lista por categoria");
            System.out.println("8. Ordenar participantes por pais");
            System.out.println("9. Salir");
            respuesta  = sc.nextInt();
            switch (respuesta){
                case 1:
                    maraton1.cargarAtletas();break;
                case 2:
                    maraton1.guardarAtletas();break;
                case 3:
                    maraton1.inscribirAtleta();break;
                case 4:
                    System.out.println("Dorsal de atleta: ");
                    int dorsalTiempo = sc.nextInt();
                    System.out.println("Tiempo realizado: ");
                    double tiempoRealizado = sc.nextDouble();
                    maraton1.guardarTiempo(dorsalTiempo,tiempoRealizado);break;
                case 5:
                    System.out.println("Dorsal de atleta a borrar: ");
                    int dorsal = sc.nextInt();
                    maraton1.borrarAtleta(dorsal);break;
                case 6:
                    maraton1.MostrarListaFinishers();break;
                case 7:
                    System.out.println("¿Que categoria desea ver?");
                    System.out.println("1.Senior");
                    System.out.println("2.Junior");
                    System.out.println("3.Veterano");
                    int respuestaCategoria = sc.nextInt();
                    Atleta.CategoriaAtleta categoriaMostrar = null;
                    if (respuestaCategoria == 1){
                        categoriaMostrar = Atleta.CategoriaAtleta.SENIOR;
                    }else if (respuestaCategoria == 2){
                        categoriaMostrar = Atleta.CategoriaAtleta.JUNIOR;
                    }else if (respuestaCategoria == 3){
                        categoriaMostrar = Atleta.CategoriaAtleta.VETERANO; break;
                    }
                    maraton1.MostrarListaCategoria(categoriaMostrar);break;
                case 8:
                    System.out.println("Introduce pais: ");
                    String paisMostrar = sc.next();
                    maraton1.ParticipantesPorPaís(paisMostrar);break;
                case 9: break;
            }
        }while (respuesta!=9);
    }
}
