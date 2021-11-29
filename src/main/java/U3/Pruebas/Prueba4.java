package U3.Pruebas;

//Define la función convierteArrayEnString con la siguiente cabecera:
//public static String convierteArrayEnString(int[] a)
//Esta función toma como parámetro un array que contiene números y devuelve
//una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
//vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
//devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
//“62501”.

public class Prueba4 {
    public static void main(String[] args) {
        int [] array = {8,6,7,4,22};

        System.out.println(covierteEnStrign(array));
    }

    private static String covierteEnStrign(int[] a) {
        String arraytoString = "“";
        for (int i = 0; i < a.length; i++) {
            arraytoString = arraytoString + a[i];
        }
        arraytoString = arraytoString + "“";
        return arraytoString;
    }

}
