package U5.Tarea1.Parte4;

public class Television extends Electrodomestico{



    private int pulgadas = 20;
    private boolean TDT = false;

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, coloresDisponibles color, consumoEnergetico consumoLetra, double peso, int pulgadas, boolean TDT) {
        super(precioBase, color, consumoLetra, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase= " + precioBase +
                ", color= " + color +
                ", consumoLetra= " + consumoLetra +
                ", peso= " + peso +
                ", pulgadas= " + pulgadas +
                ", tdt= " + isTDT() +
                ", precioFinal= " + getPrecioFinal() +
                '}';
    }


    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public double getPrecioFinal(){
        double precioFinal = super.getPrecioFinal();
        if (getPulgadas()>=40){
            precioFinal += (precioFinal*0.3);
        }
        if (isTDT()){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
