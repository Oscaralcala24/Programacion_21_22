package U3.Pruebas;

//Escribe un programa que pida 20 números enteros. Estos números se deben
//introducir en un array de 4 filas por 5 columnas. El programa mostrará las
//sumas parciales de filas y columnas igual que si de una hoja de cálculo se
//tratara. La suma total debe aparecer en la esquina inferior derecha.

public class Prueba2 {
    public static void main(String[] args) {
        int [][] arrayBidimensional = new int[4][5];
        rellernaryMostarArray(arrayBidimensional);
    }

    private static void rellernaryMostarArray(int[][] array) {
        int sumatorioTotal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*100);
                System.out.print(" || "+array[i][j]+" || ");
            }
            sumatorioTotal = sumatorioTotal + sumatorioFila(array,i);
            System.out.println(" || "+sumatorioFila(array,i)+" || ");
        }
        for (int i = 0; i < 5; i++) {
            sumatorioTotal = sumatorioTotal + sumatorioColumna(array,i);
            System.out.print(" || "+sumatorioColumna(array,i)+" || ");
        }
        System.out.println(" || "+sumatorioTotal+" || ");
    }

    private static int sumatorioColumna(int[][] array, int i) {
        int sumatorio = 0;
        for (int j = 0; j < 4; j++) {
            sumatorio = sumatorio + array[j][i];
        }
        return sumatorio;
    }

    private static int sumatorioFila(int[][] array, int i) {
        int sumatorio = 0;
        for (int k = 0; k < array[i].length; k++) {
            sumatorio = sumatorio + array[i][k];
        }
        return sumatorio;
    }
}
