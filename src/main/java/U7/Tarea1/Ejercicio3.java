package U7.Tarea1;

//Actividad 3: Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos
// por orden decreciente a medida que se vayan generando y mostrar la colección por pantalla.

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            Integer numeroRandom = ((int) (1 + Math.random()*9));
            Iterator<Integer> it = numerosEnteros.iterator();
            if (numerosEnteros.size()<2){
                if (numerosEnteros.isEmpty()){
                    numerosEnteros.add(numeroRandom);
                }else {
                    if (numerosEnteros.get(0) < numeroRandom){
                        numerosEnteros.add(0,numeroRandom);
                    }else {
                        numerosEnteros.add(numeroRandom);
                    }
                }
            }else {
                for (int j = 0; j < i; j++) {
                    if ((numerosEnteros.get(j) <=  numeroRandom &&  j == 0)){
                        numerosEnteros.add(0,numeroRandom);
                        break;
                    }else if (numerosEnteros.get(j) >= numeroRandom && !it.hasNext()){
                        numerosEnteros.add(numeroRandom);
                        break;
                    }else if (numerosEnteros.get(j) > numeroRandom && numerosEnteros.get(j+1) <= numeroRandom){
                        numerosEnteros.add(j+1,numeroRandom);
                        break;
                    }
                    it.next();
                }
            }
        }
        mostrarArray(numerosEnteros);
    }

    private static void mostrarArray(ArrayList<Integer> numerosEnteros) {
        for (Integer i: numerosEnteros) {
            System.out.print(i + " ");
        }
    }
}
