package U3.T3;

//Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
// y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.

public class Ejercicio9 {
    public static void main(String[] args) {
        int [] combinacionApuesta = {2,13,17,28,33,40};
        int [] combinacionGanadora = {4,19,34,33,43,48};
        System.out.println("El numero de aciertos es: " + ComprobarNumeros(combinacionApuesta, combinacionGanadora));
    }

    private static int ComprobarNumeros(int[] combinacionApuesta, int[] combinacionGanadora) {
        int contadorAciertos = 0;
        for (int i = 0; i < combinacionApuesta.length; i++) {
            for (int j = 0; j < combinacionGanadora.length; j++) {
                if (combinacionApuesta[i] == combinacionGanadora[j]){
                    contadorAciertos++;
                }
            }
        }
        return contadorAciertos;
    }
}
