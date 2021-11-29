package U3.Pruebas;

//Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países.
// El array que contiene los nombres de los paises es el siguiente:
// pais = {España, Rusia, Japón, Australia}. Los datos sobre las estaturas se deben simular mediante un
//array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210.
// Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando
// el array de países (no se pueden escribir directamente).

public class ej2_2021_MANANA_ROJO {
    public static void main(String[] args) {
        int [][] arrayPaises = new int[4][10];
        rellenarArray(arrayPaises);
        System.out.println("                                                                                                     MED  MIN   MAX");
        for (int i = 0; i < arrayPaises.length; i++) {
            if (i == 0){
                System.out.print("España    ");
            }else if (i == 1){
                System.out.print("Rusia     ");
            }else if (i == 2){
                System.out.print("Japon     ");
            }else {
                System.out.print("Australia ");
            }
            for (int j = 0; j < arrayPaises[i].length; j++) {
                System.out.print(" | "+arrayPaises[i][j]+" | ");
            }
            System.out.print(" "+getMedia(arrayPaises, i)+" ");;
            System.out.print(" "+getMin(arrayPaises, i)+" ");
            System.out.println(" "+getMax(arrayPaises, i)+" ");
        }
    }

    private static int getMax(int[][] arrayPaises, int i) {
        int numeroMax = arrayPaises[i][0];
        for (int j = 0; j < arrayPaises[i].length; j++) {
            if (numeroMax<arrayPaises[i][j]){
                numeroMax = arrayPaises[i][j];
            }
        }
        return numeroMax;
    }

    private static int getMin(int[][] arrayPaises, int i) {
        int numeroMin = arrayPaises[i][0];
        for (int j = 0; j < arrayPaises[i].length; j++) {
            if (numeroMin>arrayPaises[i][j]){
                numeroMin = arrayPaises[i][j];
            }
        }
        return numeroMin;
    }

    private static int getMedia(int[][] arrayPaises, int i) {
        int media = 0;
        for (int j = 0; j < arrayPaises[i].length; j++) {
            media = media + arrayPaises[i][j];
        }
        media/=arrayPaises[i].length;
        return media;
    }

    private static void rellenarArray(int[][] arrayPaises) {
        for (int i = 0; i < arrayPaises.length; i++) {
            for (int j = 0; j < arrayPaises[i].length; j++) {
                arrayPaises[i][j] = (int) (140+Math.random()*71);
            }
        }
    }
}
