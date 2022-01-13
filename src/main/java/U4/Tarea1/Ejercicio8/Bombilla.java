package U4.Tarea1.Ejercicio8;

public class Bombilla {


    private boolean encendida;
    private static boolean interruptorGeneral = true;

    public Bombilla(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isEncendida() {
        boolean estado;
        if (interruptorGeneral && encendida){
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public static void apagon() {
        Bombilla.interruptorGeneral = false;
    }

    public static void reparado() {
        Bombilla.interruptorGeneral = true;
    }

}
