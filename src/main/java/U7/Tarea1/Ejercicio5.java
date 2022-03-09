package U7.Tarea1;

//Actividad 5: Crear una colección de 20 números enteros aleatorios distintos menores que 100,
// guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) (1+ Math.random()*99);
            while (comprobarRepetido(numerosEnteros, numeroAleatorio)){
                numeroAleatorio = (int) (1+ Math.random()*99);
            }
            int indice = 0;
            for (int j = 0; j < numerosEnteros.size(); j++) {
                if (numerosEnteros.get(j) > numeroAleatorio){
                    indice++;
                }
            }
            numerosEnteros.add(indice,numeroAleatorio);
        }
        mostrarLista(numerosEnteros);
    }

    private static void mostrarLista(ArrayList<Integer> numerosEnteros) {
        for (Integer i: numerosEnteros) {
            System.out.print(i + " ");
        }
    }

    private static boolean comprobarRepetido(ArrayList<Integer> numerosEnteros, int numeroAleatorio) {

        for (int i = 0; i < numerosEnteros.size(); i++) {
            if (numerosEnteros.get(i) == numeroAleatorio){
                return true;
            }
        }
        return false;
    }
}


