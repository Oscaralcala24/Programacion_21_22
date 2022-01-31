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

    public void restarPuntosVidaPatada(Personaje personaje){
        if (this.puntosVida> personaje.getDanoPatada()){
            setPuntosVida(puntosVida-personaje.getDanoPatada());
            System.out.println("Ha inflijido "+ personaje.getDanoPatada() + " puntos de daño");
        }else {
            System.out.println("Ha inflijido "+ personaje.getDanoPatada() + " puntos de daño");
            System.out.println("El enemigo ha muerto");

        }

    }
    public void restarPuntosVidaPunetazo(Personaje personaje){
        if (this.puntosVida>personaje.getDanoPunetazo()){
            setPuntosVida(puntosVida-personaje.getDanoPatada());
            System.out.println("Ha inflijido "+ personaje.getDanoPatada() + " puntos de daño");
        }else {
            System.out.println("Ha inflijido "+ personaje.getDanoPatada() + " puntos de daño");
            System.out.println("El enemigo ha muerto");

        }

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


    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}
