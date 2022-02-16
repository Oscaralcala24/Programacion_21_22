package U5.Tarea2.Ejercicio3;

public class Cuadrado extends PoligonoRegular{


    public Cuadrado(int lado, colores colorines) {
        super(lado, colorines);
        contadorPoligonos++;
    }
    public Cuadrado() {
        super(10, colores.AZUL);
        contadorPoligonos++;
    }

    @Override
    public void getArea() {
        System.out.println(Math.pow(lado,2));
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", colorines=" + colorines +
                '}';
    }
}
