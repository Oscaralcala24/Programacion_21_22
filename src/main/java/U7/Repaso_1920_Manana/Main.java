package U7.Repaso_1920_Manana;


public class Main {
    public static void main(String[] args) {
        Concurso c1 = new Concurso("Alixar","Castilleja");

        Propietario prop1 = new Propietario("Oscar", "Alcala", "España");
        Propietario prop2 = new Propietario("Juanlu", "Terron", "Italia");

        Perro perro1 = new Perro("Chispas", 8,25,true,prop1, Perro.Raza.BOXER);
        Perro perro2 = new Perro("aaaaaaa", 4,4,true,prop2, Perro.Raza.PASTOR_ALEMAN);
        Perro perro3 = new Perro("eeeeeeee", 12,54,true,prop1, Perro.Raza.LABRADOR);
        Perro perro4 = new Perro("ooooooo", 4,34,false,prop2, Perro.Raza.HUSKY);
        Perro perro5 = new Perro("iiiiiii", 6,21,false,prop1, Perro.Raza.CANICHE);
        Perro perro6 = new Perro("uuuuuuu", 9,15,true,prop1, Perro.Raza.BOXER);
        Perro perro7 = new Perro("Sultan", 10,32,true,prop1, Perro.Raza.BULLDOG);

        c1.addDog(perro1.getRaza(),perro1);
        c1.addDog(perro2.getRaza(),perro2);
        c1.addDog(perro3.getRaza(),perro3);
        c1.addDog(perro4.getRaza(),perro4);
        c1.addDog(perro5.getRaza(),perro5);
        c1.addDog(perro6.getRaza(),perro6);
        c1.addDog(perro7.getRaza(),perro7);

        c1.ownerDogs(1);
        c1.disqualifyDog(perro2);
        System.out.println();
        System.out.println();
        c1.ownerDogs(1);
        System.out.println();
        System.out.println();
        System.out.println();

        c1.perrosporPeso(Perro.Raza.BOXER);
        System.out.println();
        c1.perrosporEdad(Perro.Raza.BOXER);

        c1.guardarPerros();
    }

}
