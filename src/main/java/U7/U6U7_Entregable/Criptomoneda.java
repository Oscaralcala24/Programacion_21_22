package U7.U6U7_Entregable;

import java.io.Serializable;

public class Criptomoneda extends Divisa implements Serializable{

    private double precioDolar;
    private double volumenTransaccion24h;
    private final String fechaCreacion;
    private int ranking;

    public Criptomoneda(String nombre, String simbolo ,double precioDolar,double volumenTransaccion24h,String fechaCreacion,int ranking) {
        super(nombre, simbolo);
        this.precioDolar = precioDolar;
        this.volumenTransaccion24h = volumenTransaccion24h;
        this.fechaCreacion = fechaCreacion;
        this.ranking = ranking;
    }

    public double getPrecioDolar() {
        return precioDolar;
    }

    public void setPrecioDolar(double precioDolar) {
        this.precioDolar = precioDolar;
    }

    public double getVolumenTransaccion24h() {
        return volumenTransaccion24h;
    }

    public void setVolumenTransaccion24h(double volumenTransaccion24h) {
        this.volumenTransaccion24h = volumenTransaccion24h;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "Divisa =" + getNombre() +
                ", Simbolo =" + getSimbolo() +
                ", precioDolar=" + precioDolar +
                ", ranking=" + ranking +
                '}';
    }
}
