package U3.Pruebas;

//Implementa la función aleatorioDeArray con la cabecera que se muestra a
//continuación:
//public static int aleatorioDeArray(int[] a)
//Esta función debe devolver un número del array escogido al azar entre todos
//los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
//podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
//DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
//prueba.

public class Prueba5 {
    public static void main(String[] args) {
        int [] array = {11,22,33,44,55,66};
        System.out.println("El aleatorio de este array es: "+ aleatorioDeArray(array));
    }

    private static int aleatorioDeArray(int[] array) {
        int numeroAleatorio = array[(int) (Math.random()*array.length)];
        return numeroAleatorio;
    }
}
