package U4.Tarea1.Ejercicio7;

public class Sintonizador {

    private double frecuencia;

    public Sintonizador() {
        this.frecuencia = 80;
    }

    void subirFrecuencia(){
        double subida = 0.5;
        if (this.frecuencia+subida<=108){
            this.frecuencia = getFrecuencia()+subida;
        }else {
            this.frecuencia = 80;
        }
    }

    void bajarFrecuencia(){
        double bajada = 0.5;
        if (this.frecuencia-bajada>=80){
            this.frecuencia = getFrecuencia()-bajada;
        }else {
            this.frecuencia = 108;
        }
    }

    public double getFrecuencia() {
        return frecuencia;
    }

}
