package U7.U6U7_Entregable;

import java.io.Serializable;

public class Fiat extends Divisa implements Serializable {

    private String paisReferencia;

    public Fiat(String nombre, String simbolo, double precioDolar,String paisReferencia) {
        super(nombre, simbolo);
        this.paisReferencia = paisReferencia;
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "Divisa =" + getNombre() +
                ", Simbolo =" + getSimbolo() +
                ", paisReferencia='" + paisReferencia + '\'' +
                '}';
    }
}
