package U3.examen_U3;

//Realiza un programa que genere 10 números aleatorios entre 12 y 89 y que los almacene en un array.
// A continuación, se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello
// otro array adicional (o bien utilizando originalmente un array bidimensional, como se prefiera).
// Seguidamente el programa pasará los números pares a las primeras posiciones, conservando el orden,
// desplazando el resto de números (los impares) de tal forma que no se pierda ninguno y se conserve el
// orden entre ellos.
// Al final se debe mostrar el array resultante junto con el índice.

public class Ej2 {
    public static void main(String[] args) {
        int [][] arrayAleatorios = new int[2][10];

        rellernarArray(arrayAleatorios);
        int[][] arrayAux = new int[arrayAleatorios.length][arrayAleatorios[0].length];
        ordenarArray(arrayAleatorios, arrayAux);
        System.out.println();
        mostrarArrayParesImpares(arrayAux);
    }

    private static void mostrarArrayParesImpares(int[][] arrayAux) {
        for (int i = 0; i < arrayAux.length; i++) {
            for (int j = 0; j < arrayAux[i].length; j++) {
                if (i == 0){
                    System.out.print(" ||  "+arrayAux[i][j]+" || ");
                }else {
                    System.out.print(" || " + arrayAux[i][j] + " || ");
                }

            }
            System.out.println();
        }
    }

    private static void ordenarArray(int[][] arrayAleatorios, int[][] arrayAux) {
        int contadorIntroducido = 0;
        for (int i = 0; i < arrayAleatorios[0].length; i++) {
            arrayAux[0][i] = i;
        }
        for (int i = 0; i < arrayAleatorios[1].length; i++) {
            if (arrayAleatorios[1][i] % 2 == 0){
                arrayAux[1][contadorIntroducido] = arrayAleatorios[1][i];
                contadorIntroducido++;
            }
        }
        for (int i = 0; i < arrayAleatorios[1].length; i++) {
            if (arrayAleatorios[1][i] % 2 != 0){
                arrayAux[1][contadorIntroducido] = arrayAleatorios[1][i];
                contadorIntroducido++;
            }
        }
    }




    private static void rellernarArray(int[][] arrayAleatorios) {
        for (int i = 0; i < arrayAleatorios.length; i++) {
            for (int j = 0; j < arrayAleatorios[i].length; j++) {
                if (i == 0){
                    arrayAleatorios[i][j] = j;
                    System.out.print(" ||  "+arrayAleatorios[i][j]+" || ");
                }else{
                    arrayAleatorios[i][j] = (int) (12 + Math.random()*78);
                    System.out.print(" || "+arrayAleatorios[i][j]+" || ");
                }
            }
            System.out.println();
        }
    }
}
