package U7.Tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<>();
        String nombre = "";
        int contador = 0;
        while (comprobarFin(listaNombres,nombre)){
            System.out.println("Introduce un nombre: ");
            nombre = sc.next();
            if (!comprobarRepetido(listaNombres, nombre)){
                listaNombres.add(contador++,nombre);
            }else{
                System.out.println("Nombre repetido.");
            }
        }
        mostrarLista(listaNombres);
    }

    private static boolean comprobarFin(ArrayList<String> listaNombres, String nombre) {
        for (int i = 0; i < listaNombres.size(); i++) {
            if (listaNombres.get(i).equalsIgnoreCase("fin")){
                return false;
            }
        }
        return true;
    }

    private static void mostrarLista(ArrayList<String> listaNombres) {
        for (String i: listaNombres) {
            System.out.println(i + " ");
        }
    }

    private static boolean comprobarRepetido(ArrayList<String> listaNombres, String nombre) {
        for (int i = 0; i < listaNombres.size(); i++) {
            if (listaNombres.get(i).equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }


}
