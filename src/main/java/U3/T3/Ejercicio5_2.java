package U3.T3;

import java.util.Arrays;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        int []primerArray = {2,4,5,9,2,7};
        int []segundoArray = {8,3,2,7,1,12};
        int []arrayOrdenado = new int [primerArray.length + segundoArray.length];
        Arrays.sort(primerArray);
        Arrays.sort(segundoArray);
        int i = 0;
        int j = 0;
        for (int k = 0; k < 12; k++) {
            if (i == 6 && j < 6){
                arrayOrdenado[k] = segundoArray[j];
                j++;
            }else if (j==6 && i < 6){
                arrayOrdenado[k] = primerArray[i];
                i++;
            }else if (i<6 && primerArray[i] < segundoArray[j]){
                arrayOrdenado[k] = primerArray[i];
                i++;
            }else if (j<6 && primerArray[i] >= segundoArray[j]){
                arrayOrdenado[k] = segundoArray[j];
                j++;
            }else {
                break;
            }
        }
        System.out.println(Arrays.toString(arrayOrdenado));
    }
}

