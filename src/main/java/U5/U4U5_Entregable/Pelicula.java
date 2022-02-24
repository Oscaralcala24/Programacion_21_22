package U5.U4U5_Entregable;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class Pelicula extends Multimedia implements Reproducible{



    private String directorPelicula;
    private double duracion;
    private String productora;
    private String pais;

    public Pelicula(String titulo,String directorPelicula,double duracion,String productora, int anoPublicacion,String pais) {
        super(titulo, anoPublicacion);
        this.directorPelicula = directorPelicula;
        this.duracion = duracion;
        this.pais = pais;
        this.productora = productora;
    }

    @Override
    void dar_por_finalizado() {
        System.out.println("La pelicula "+ this.getTitulo()+" se ha finalizado" );
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo película "+ this.getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando película "+ this.getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando película "+ this.getTitulo());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                super.toString()+
                "directorPelicula='" + directorPelicula + '\'' +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                '}'+"\n";
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
