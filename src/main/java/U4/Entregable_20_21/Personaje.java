package U4.Entregable_20_21;

public class Personaje {

    private tiposPersonajes nombrePersonaje;
    private double velocidadMovimiento;
    private int danoPunetazo;
    private int danoPatada;


    public Personaje() {
        this.nombrePersonaje = tiposPersonajes.SONIC;
        this.velocidadMovimiento = 100.0;
        this.danoPunetazo = 100;
        this.danoPatada = 200;
    }

    public Personaje(tiposPersonajes nombrePersonaje, double velocidadMovimiento, int danoPunetazo, int danoPatada) {
        this.nombrePersonaje = nombrePersonaje;
        this.velocidadMovimiento = velocidadMovimiento;
        this.danoPunetazo = danoPunetazo;
        this.danoPatada = danoPatada;
    }

    public enum tiposPersonajes{
        SONIC,
        TAILS,
        KNUCKLES
    }

    public void mostarInfoPersonaje(){
        System.out.println("Este personaje es: " + this.nombrePersonaje);
        System.out.println("Su velocidad de movimiento es: " + this.velocidadMovimiento);
        System.out.println("Su ataque puñetazo inflinje: " + this.danoPunetazo+ " puntos de daño");
        System.out.println("Su ataque patada inflinje: " + this.danoPatada+ " puntos de daño");
    }

    public void pegaPunetazo(int enemigoAtacar){
        restar
    }
}
