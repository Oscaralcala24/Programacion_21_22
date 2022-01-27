package U4.Entregable_20_21;

public class Enemigo {

    private tipoEnemigo nombreEnemigo;
    private int puntosVida;
    private int puntosDano;


    public Enemigo(tipoEnemigo nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
        this.puntosDano = 70;
        this.puntosVida = 100;
    }

    public void restarPuntosVida(){

    }

    public void mostrarInfoEnemigo(){
        System.out.println("El enemigo es: "+ this.nombreEnemigo);
        System.out.println("Tiene: " + this.puntosVida + " puntos de vida");
        System.out.println("Inflinje: " + this.puntosDano + " puntos de daño");
    }

    public enum tipoEnemigo{
        BUZZBOMBER,
        CRABMEAT,
        COCONUTS,
        CHOPPER,
        MOTOBUG;
    }

    public tipoEnemigo getNombreEnemigo() {
        return nombreEnemigo;
    }
    public void nombreEnemigo(){
        System.out.println(nombreEnemigo);
    }
}
