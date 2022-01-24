package U4.Tarea2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        PilaTabla pila1 = new PilaTabla();
        pila1.apilar();
        pila1.apilar();
        System.out.println("El numero que esta en la cima es: "+ pila1.cima());
        pila1.apilar();
        pila1.apilar();
        System.out.println("El numero que esta en la cima es: "+ pila1.cima());
        pila1.apilar();
        System.out.println("El numero que esta en la cima es: "+ pila1.cima());
        pila1.desapilar();
        System.out.println("El numero que esta en la cima es: "+ pila1.cima());
        pila1.desapilar();
        pila1.desapilar();

        System.out.println("El numero que esta en la cima es: "+ pila1.cima());

    }

}
