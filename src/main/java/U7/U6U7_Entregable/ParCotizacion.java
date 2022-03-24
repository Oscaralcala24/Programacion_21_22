package U7.U6U7_Entregable;

import java.io.Serializable;

public class ParCotizacion implements Serializable {
    private Divisa divisaBase;
    private Divisa divisaCotizada;
    private double precioEstablecido;
    private double variacionPorcentual;

    public ParCotizacion(double precioEstablecido, double variacionPorcentual,Divisa divisaBase,Divisa divisaCotizada) {
        this.precioEstablecido = precioEstablecido;
        this.variacionPorcentual = variacionPorcentual;
        this.divisaBase = divisaBase;
        this.divisaCotizada = divisaCotizada;
    }

    public Divisa getDivisaBase() {
        return divisaBase;
    }

    public void setDivisaBase(Divisa divisaBase) {
        this.divisaBase = divisaBase;
    }

    public Divisa getDivisaCotizada() {
        return divisaCotizada;
    }

    public void setDivisaCotizada(Divisa divisaCotizada) {
        this.divisaCotizada = divisaCotizada;
    }

    public double getPrecioEstablecido() {
        return precioEstablecido;
    }

    public void setPrecioEstablecido(double precioEstablecido) {
        this.precioEstablecido = precioEstablecido;
    }

    public double getVariacionPorcentual() {
        return variacionPorcentual;
    }

    public void setVariacionPorcentual(double variacionPorcentual) {
        this.variacionPorcentual = variacionPorcentual;
    }

    @Override
    public String toString() {
        return "ParCotizacion{" +
                "divisaBase=" + divisaBase.toString() +
                ", divisaCotizada=" + divisaCotizada.toString() +
                ", precioEstablecido=" + precioEstablecido +
                ", variacionPorcentual=" + variacionPorcentual +
                '}';
    }
}
