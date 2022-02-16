package U5.Tarea2.Ejercicio3;

public class Triangulo extends PoligonoRegular implements Comparable{


    private int altura;

    public Triangulo(int lado, colores colorines, int altura) {
        super(lado, colorines);
        this.altura = altura;
        contadorPoligonos++;
    }
    public Triangulo() {
        super(10, colores.AZUL);
        this.altura = 10;
        contadorPoligonos++;
    }


    @Override
    public void getArea() {
        System.out.println((this.lado*this.altura)/2);
    }

    @Override
    public int compareTo(Object o) {
        Triangulo that = (Triangulo) o;
        if (this.lado < that.lado){
            return -1;
        }else if (this.lado > that.lado){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                ", colorines=" + colorines +
                ", altura=" + altura +
                '}';
    }

}
