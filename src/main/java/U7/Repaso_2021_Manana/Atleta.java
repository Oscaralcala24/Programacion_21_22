package U7.Repaso_2021_Manana;

import java.io.Serializable;

public class Atleta implements Comparable<Atleta>, Serializable {

    private String nombre;
    private String pais;
    private CategoriaAtleta categoria;
    private boolean finisher = false;
    private static int contador = 1;
    private int dorsal;
    private double marcaRealizada;

    public Atleta(String nombre, String pais, CategoriaAtleta categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.dorsal = contador++;
    }

    @Override
    public int compareTo(Atleta o) {
        if (getMarcaRealizada() > o.getMarcaRealizada()){
            return 1;
        }else if (getMarcaRealizada() < o.getMarcaRealizada()){
            return -1;
        }
        return 0;
    }

    public enum CategoriaAtleta{
        SENIOR,
        JUNIOR,
        VETERANO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public CategoriaAtleta getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaAtleta categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public double getMarcaRealizada() {
        return marcaRealizada;
    }

    public void setMarcaRealizada(double marcaRealizada) {
        this.marcaRealizada = marcaRealizada;
    }

    public int getDorsal() {
        return dorsal;
    }



    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                ", dorsal=" + dorsal +
                ", marcaRealizada=" + marcaRealizada +
                '}';
    }
}
