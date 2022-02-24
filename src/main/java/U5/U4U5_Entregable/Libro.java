package U5.U4U5_Entregable;

import java.util.Date;

public class Libro extends Multimedia{

    private String autor;
    private String editorial;
    private String ISBN;
    private int numPaginas;


    public Libro(String titulo,String autor,String editorial,String ISBN, int anoPublicacion,int numPaginas) {
        super(titulo, anoPublicacion);
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    @Override
    void dar_por_finalizado() {
        System.out.println("El libro "+ this.getTitulo()+" se ha finalizado" );
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString()+
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numPaginas=" + numPaginas +
                '}'+"\n";
    }
}
