package U5.Tarea1.Parte4;

import java.util.Arrays;

public class Lavadora extends Electrodomestico implements Comparable{

    private int carga = 5;

    public Lavadora(double precioBase, coloresDisponibles color, consumoEnergetico consumoLetra, double peso, int carga) {
        super(precioBase, color, consumoLetra, peso);
        this.carga = carga;
    }

    public void introducirLavadora(Lavadora[] arrayLavadora) {
        arrayLavadora = Arrays.copyOf(arrayLavadora, arrayLavadora.length+1);
        arrayLavadora[arrayLavadora.length-1] = this;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase= " + precioBase +
                ", color= " + color +
                ", consumoLetra= " + consumoLetra +
                ", peso= " + peso +
                ", carga= " + carga +
                ", precioFinal= " + getPrecioFinal() +
                '}';
    }

    public int getCarga() {
        return carga;
    }

    public double getPrecioFinal(){
        double precioFinal = super.getPrecioFinal();
        if (getCarga()>=30){
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public int compareTo(Object o) {
        Lavadora lv1 = (Lavadora) o;
        if (this.carga < lv1.carga){
            return -1;
        }else if (this.carga > lv1.carga){
            return 1;
        }
        return 0;
    }
}
