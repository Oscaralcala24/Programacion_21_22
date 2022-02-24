package U5.U4U5_Entregable;

import java.util.Arrays;
import java.util.Date;

public class Serie extends Multimedia implements Reproducible{
    private String creadorSerie;
    private int numeroTemporadas;
    private String[] capitulos = new String[0];


    public Serie(String titulo,String creadorSerie,int numeroTemporadas, int anoPublicacion) {
        super(titulo, anoPublicacion);
        this.creadorSerie = creadorSerie;
        this.numeroTemporadas = numeroTemporadas;

    }

    void add_capitulo(String capitulo){
        this.capitulos = Arrays.copyOf(this.capitulos, this.capitulos.length+1);
        this.capitulos[this.capitulos.length-1] = capitulo;
    }
    boolean eliminar_capitulo(String capitulo){
        String[] arrayAux = new String[0];
        boolean eliminado = false;
        int contadorAux = 0;
        for (int i = 0; i < this.capitulos.length; i++) {
            if (!this.capitulos[i].equalsIgnoreCase(capitulo)){
                arrayAux = Arrays.copyOf(arrayAux, arrayAux.length+1);
                arrayAux[arrayAux.length-1] = this.capitulos[i];

            }else {
                contadorAux++;
            }
        }
        this.capitulos = Arrays.copyOf(arrayAux, arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.capitulos[i] = arrayAux[i];
        }
        if (contadorAux == 1){
            eliminado = true;
        }
        return eliminado;
    }

    void mostrarCapitulos(){
        for (int i = 0; i < capitulos.length; i++) {
            System.out.println(capitulos[i]);
        }
    }

    public String getCapituloAleatorio() {
        int numeroAleatorio = (int)(Math.random() * capitulos.length);
        return capitulos[numeroAleatorio];
    }

    @Override
    void dar_por_finalizado() {
        System.out.println("La serie "+ this.getTitulo()+" se ha finalizado" );
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo serie "+ this.getTitulo()+", capitulo " + this.getCapituloAleatorio());
    }

    @Override
    public void pause() {
        System.out.println("Pausando serie "+ this.getTitulo() + ", capitulo " + this.getCapituloAleatorio());
    }

    @Override
    public void stop() {
        System.out.println("Pausando serie "+ this.getTitulo() + ", capitulo " + this.getCapituloAleatorio());
    }

    @Override
    public String toString() {
        return "Serie{" +
                super.toString()+
                "creadorSerie='" + creadorSerie + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", capitulos=" + Arrays.toString(capitulos) +
                '}'+"\n";
    }

    public String getCreadorSerie() {
        return creadorSerie;
    }

    public void setCreadorSerie(String creadorSerie) {
        this.creadorSerie = creadorSerie;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String[] capitulos) {
        this.capitulos = capitulos;
    }
}
