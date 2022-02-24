package U5.U4U5_Entregable;

import java.util.Date;

public abstract class Multimedia extends Catalogo implements Comparable{

    private String titulo;
    private int anoPublicacion;
    private static int contadorID = 0;
    private int id;

    protected Multimedia(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        contadorID++;
        this.id = contadorID;
    }

    abstract void dar_por_finalizado();


    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", id=" + id +
                "\n";
    }

    @Override
    public int compareTo(Object o) {
        Multimedia m1 = (Multimedia) o;
        if (m1.getId() > this.getId()){
            return -1;
        } else if (m1.getId() < this.getId()) {
            return 1;
        }
        return 0;
    }


    public int getAnoPublicacion() {
        return anoPublicacion;
    }


    public static int getContadorID() {
        return contadorID;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public static void setContadorID(int contadorID) {
        Multimedia.contadorID = contadorID;
    }

    public void setId(int id) {
        this.id = id;
    }
}
