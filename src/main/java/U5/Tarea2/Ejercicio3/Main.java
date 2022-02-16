package U5.Tarea2.Ejercicio3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] arrayFiguras = new Figura[5];

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(25, PoligonoRegular.colores.AMARILLO, 5);
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado(44, PoligonoRegular.colores.ROJO);
        Circulo circulo1 = new Circulo();

        arrayFiguras[0] = t1;
        arrayFiguras[1] = t2;
        arrayFiguras[2] = c1;
        arrayFiguras[3] = c2;
        arrayFiguras[4] = circulo1;

        for (int i = 0; i < arrayFiguras.length; i++) {
            System.out.println(arrayFiguras[i]);
        }
        System.out.println(PoligonoRegular.contadorPoligonos);


        Triangulo t3 = new Triangulo(64, PoligonoRegular.colores.VERDE, 12);
        Triangulo t4 = new Triangulo(23, PoligonoRegular.colores.AMARILLO, 22);
        Triangulo t5 = new Triangulo(12, PoligonoRegular.colores.ROJO, 43);
        Triangulo[] arrayTriangulos = new Triangulo[5];

        arrayTriangulos[0] = t1;
        arrayTriangulos[1] = t2;
        arrayTriangulos[2] = t3;
        arrayTriangulos[3] = t4;
        arrayTriangulos[4] = t5;

        Arrays.sort(arrayTriangulos);
        mostrarArray(arrayTriangulos);
        System.out.println();
        Arrays.sort(arrayTriangulos, new CompararColorTriangulo());
        mostrarArray(arrayTriangulos);

    }

    private static void mostrarArray(Triangulo[] arrayTriangulos) {
        for (int i = 0; i < arrayTriangulos.length; i++) {
            System.out.println(arrayTriangulos[i]);
        }
    }
}
