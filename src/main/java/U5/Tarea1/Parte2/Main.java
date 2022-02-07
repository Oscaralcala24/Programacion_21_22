package U5.Tarea1.Parte2;

public class Main {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Campana c1 = new Campana();
        p1.add(Instrumento.notasMusicales.FA);
        p1.add(Instrumento.notasMusicales.DO);
        p1.add(Instrumento.notasMusicales.MI);
        p1.interpretar();
    }


}
