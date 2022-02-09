package U5.Tarea1.Parte4;

public class Lavadora extends Electrodomestico{

    private int carga = 5;

    public Lavadora(double precioBase, coloresDisponibles color, consumoEnergetico consumoLetra, double peso, int carga) {
        super(precioBase, color, consumoLetra, peso);
        this.carga = carga;
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
}
