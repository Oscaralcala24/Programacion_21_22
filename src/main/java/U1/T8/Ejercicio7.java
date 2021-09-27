package U1.T8;

//Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class Ejercicio7 {
    public static void main(String[] args) {

        int contadorImpares = 0;
        int numero = 0;

        while(contadorImpares<10){
            numero++;
            if (numero%2!=0){
                System.out.println(numero);
                contadorImpares++;
            }
        }
    }
}
