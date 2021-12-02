package U3.Pruebas;

//Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas y
// devuelva la unión de las dos matrices.
//
//Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.

public class ej4_Examen2021MANANAROJO {
    public static void main(String[] args) {
        String [][] array1 = {{"Hola","Perro","C++"},
                                {"Adios","Gato","Python"},
                                {"Hasta Luego","Vaca","Java"}};
        String [][] array2 = {{"BD","Sobresaliente","Pepe"},
                                {"LM","Notable","Manuel"},
                                {"Prog","Aprobado","Rosa"}};
        mostrarArray(unirMatrices(array1,array2));
    }

    private static void mostrarArray(String[][] unirMatrices) {
        for (int i = 0; i < unirMatrices.length; i++) {
            for (int j = 0; j < unirMatrices[i].length; j++) {
                System.out.print(" | "+unirMatrices[i][j]+" | ");
            }
            System.out.println();
        }
    }

    private static String[][] unirMatrices(String[][] array1, String[][] array2) {
        String [][] arrayAux = new String[array1.length][array1[0].length*2];
        if (array1.length== array2.length && array1[0].length == array2[0].length){
            for (int i = 0; i < array1.length; i++) {
                int contadorJ = 0;
                for (int j = 0; j < array1[i].length*2; j++) {
                    if (j< array1.length){
                        arrayAux[i][j] = array1[i][j];
                    }else {
                        arrayAux[i][j] = array2[i][contadorJ];
                        contadorJ++;
                    }
                }
            }
        }
        return arrayAux;
    }
}
