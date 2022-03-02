package U4.Tarea1.Ejercicio9.Maquinaria;

import U4.Tarea1.Ejercicio9.Personal.Maquinistas;

import java.io.Serializable;
import java.util.Arrays;

public class Trenes implements Serializable {

    private Locomotoras locomotora;
    Vagones[] vagones = new Vagones[0];
    private Maquinistas maquinista;

    public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }
    public void addVagon(long cargaMaxima, long cargaActual, String tipo){
        Vagones vagon1 = new Vagones(cargaMaxima, cargaActual, Vagones.tipoMercancia.valueOf(tipo));
        ingresarVagon(vagon1);
    }
    private void ingresarVagon(Vagones vagon) {
        if (vagones.length < 5) {
            vagones = Arrays.copyOf(vagones,vagones.length+1);
            vagones[vagones.length-1] = vagon;

        }else {
            System.out.println("No se pueden añadir mas vagones a este tren");
        }
    }
    public void getVagones() {
        for (int i = 0; i < vagones.length; i++) {
            vagones[i].mostrarInformacion();
        }

    }

    @Override
    public String toString() {
        return "Trenes{" +
                "locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                ", maquinista=" + maquinista +
                '}';
    }
}
