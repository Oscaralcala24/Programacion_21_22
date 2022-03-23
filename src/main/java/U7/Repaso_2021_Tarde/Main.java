package U7.Repaso_2021_Tarde;

public class Main {
    public static void main(String[] args) {

        Instituto insti1 = new Instituto("IES Alixar");
        Unidad u1 = new Unidad("4A");
        Unidad u2 = new Unidad("6B");
        Unidad u3 = new Unidad("2C");
        Alumno a1 = new Alumno("pepe", "flores", "93485949D",u1);
        Alumno a2 = new Alumno("Juanlu", "Terron", "45465422A",u1);
        Alumno a3 = new Alumno("Oscar", "Alcala", "09403485E",u2);
        Alumno a4 = new Alumno("Jose", "Garcia", "909594387C",u3);
        Alumno a5 = new Alumno("Chema", "Reina", "02857563E",u1);
        Alumno a6 = new Alumno("Carlos", "Sainz", "687574456A",u1);
        Alumno a7 = new Alumno("Lewis", "Hamilton", "85764835R",u3);
        Alumno a8 = new Alumno("Juanjo","Reina","2324485Z",u3);
        Alumno a9 = new Alumno("Ale","Molina","2535605S",u2);
        Alumno a10 = new Alumno("Sergio","Jimene","2158485H",u2);
        Alumno a11 = new Alumno("Abraham","Jimene","21216485L",u3);

        insti1.addAlumnoUnidad(a1,u1);
        insti1.addAlumnoUnidad(a2,u1);
        insti1.addAlumnoUnidad(a3,u2);
        insti1.addAlumnoUnidad(a3,u3);
        insti1.addAlumnoUnidad(a5,u1);
        insti1.addAlumnoUnidad(a6,u1);
        insti1.addAlumnoUnidad(a7,u3);
        insti1.addAlumnoUnidad(a8,u3);
        insti1.addAlumnoUnidad(a9,u2);
        insti1.addAlumnoUnidad(a10,u2);
        insti1.addAlumnoUnidad(a11,u3);
        insti1.mostrarAlumnosUnidad(u1);
        System.out.println();
        System.out.println();
        insti1.mostrarAlumnosUnidad(u1);
        System.out.println();
        System.out.println();
        insti1.mostrarAlumnosUnidad(u1);
        insti1.mostrarTodosAlumnosOrdenados();
    }
}
