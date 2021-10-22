package U3.T2;

//Realizar un programa que realice lo siguiente:
//
//a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
//b) Mostrar por consola su capacidad y longitud.
//c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser
// "Chicharrones de Chiclana" y mostrarla por consola.
//d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser
// "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.
//e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser
// "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
//f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola.
//g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
//h) Realizar el mismo ejercicio con la clase StringBuffer.
//
//Ejemplo de ejecución:
//
//El StringBuilder es : Alabí Alixar
//Capacidad inicial = 29
//Longitud inicial = 12
//Chicharrones de chiclana
//Hay 5000 Chicharrones
//Hay 5000 Chicharrones en Chiclana
//lana
//Capacidad final = 34
//Longitud final = 34

public class Ejercicio9 {
    public static void main(String[] args) {
        String fraseAlixar = "Alabí Alixar";
        StringBuilder frase = new StringBuilder(fraseAlixar);
        int numeroChicharrones = 5000;
        System.out.println(frase);
        System.out.println(frase.capacity());
        System.out.println(frase.length());
        frase = frase.replace(0, frase.length(), "Chicharrones de chiclana" );
        System.out.println(frase.replace(0, frase.length(), "Chicharrones de chiclana" ));
        frase = frase.replace(0, frase.length(), "Hay "+numeroChicharrones+" Chicharrones" );
        System.out.println(frase.replace(0, frase.length(), "Hay "+numeroChicharrones+" Chicharrones" ));
        frase = frase.append(" de Chiclana");
        System.out.println(frase);
        String ultimasLetras = frase.substring(frase.length()-4, frase.length());
        System.out.println(ultimasLetras);
        System.out.println(frase.capacity());
        System.out.println(frase.length());

        System.out.println();

        StringBuffer frase1 = new StringBuffer(fraseAlixar);
        int numeroChicharrones1 = 5000;
        System.out.println(frase1);
        System.out.println(frase1.capacity());
        System.out.println(frase1.length());
        frase1 = frase1.replace(0, frase1.length(), "Chicharrones de chiclana" );
        System.out.println(frase1.replace(0, frase1.length(), "Chicharrones de chiclana" ));
        frase1 = frase1.replace(0, frase1.length(), "Hay "+numeroChicharrones1+" Chicharrones" );
        System.out.println(frase1.replace(0, frase1.length(), "Hay "+numeroChicharrones1+" Chicharrones" ));
        frase1 = frase1.append(" de Chiclana");
        System.out.println(frase1);
        String ultimasLetras1 = frase1.substring(frase1.length()-4, frase1.length());
        System.out.println(ultimasLetras1);
        System.out.println(frase1.capacity());
        System.out.println(frase1.length());
    }
}
