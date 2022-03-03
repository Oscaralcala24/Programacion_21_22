package U5.Prueba2021;

public class Pais implements Comparable{

    private String pais;
    private int numeroParticipantes;

    public Pais(String pais, int numeroParticipantes) {
        this.pais = pais;
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }



    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                ", numeroParticipantes=" + numeroParticipantes +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Pais that = (Pais) o;
        return that.getPais().compareTo(this.getPais());
    }
}
