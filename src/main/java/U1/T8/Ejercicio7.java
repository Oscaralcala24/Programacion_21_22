package U1.T8;

//Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class Ejercicio7 {
    public static void main(String[] args) {

        int producto = 1;
        for (int i = 0; i<20 ; i++) {
           if (i%2!=0){
               producto=producto*i;
           }
        }
        System.out.println(producto);
    }
}
