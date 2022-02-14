package U5.Tarea2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        pilaTabla pila1 = new pilaTabla();
        pila1.apilar(5);
        pila1.apilar(6);
        pila1.apilar(7);
        pila1.apilar(7);
        pila1.apilar(9);
        pila1.apilar(2);
        System.out.println(pila1);
        pila1.desaPilar();
        pila1.desaPilar();
        pila1.desaPilar();
        System.out.println(pila1);
    }
}
