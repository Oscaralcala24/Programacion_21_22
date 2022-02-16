package U5.Tarea3.Ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayNumeros = new Integer[20];

        TablaNumerosEnteros(arrayNumeros);
        Arrays.sort(arrayNumeros,new ComparadorNumeros());
        System.out.println(Arrays.toString(arrayNumeros));
    }

    public static void TablaNumerosEnteros(Integer[] arrayNumeros) {
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = (int) (1 + Math.random() * 100);
        }
    }
}