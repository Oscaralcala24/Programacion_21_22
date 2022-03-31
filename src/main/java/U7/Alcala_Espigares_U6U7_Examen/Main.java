package U7.Alcala_Espigares_U6U7_Examen;

public class Main {
    public static void main(String[] args) {

        Filmaffinity productora = new Filmaffinity();

        Pelicula p1 = new Pelicula("El señor de los anillos","2000","Reino unido", "Fantasia","Jose");
        Pelicula p2 = new Pelicula("A todo gas","2005","USA", "Fantasia","Juanlu");
        Pelicula p3 = new Pelicula("Rec","2010","España", "Terror","Paco");
        Pelicula p4 = new Pelicula("Deadpool","2020","USA", "Comedia","Roberto");
        Pelicula p5 = new Pelicula("Harry Potter","2001","Reino unido", "Fantasia","Maria");

        Actor a1 = new Actor("Oscar","Alcala", "Español");
        Actor a2 = new Actor("Juan Luis","Terron", "Frances");
        Actor a3 = new Actor("Rafa","Mir", "Estadounidense");
        Actor a4 = new Actor("Fernando","Alonso", "Español");
        Actor a5 = new Actor("Kobe","Bryant", "Estadounidense");

        productora.addPeliculaActor(p1,a1);
        productora.addPeliculaActor(p1,a4);
        productora.addPeliculaActor(p1,a5);

        productora.addPeliculaActor(p2,a2);
        productora.addPeliculaActor(p2,a3);
        productora.addPeliculaActor(p2,a1);
        productora.addPeliculaActor(p2,a4);
        productora.addPeliculaActor(p2,a5);

        productora.addPeliculaActor(p3,a1);
        productora.addPeliculaActor(p3,a2);
        productora.addPeliculaActor(p3,a3);

        productora.addPeliculaActor(p4,a2);
        productora.addPeliculaActor(p4,a3);
        productora.addPeliculaActor(p4,a4);
        productora.addPeliculaActor(p4,a5);

        productora.addPeliculaActor(p5,a5);
        System.out.println("MUESTRA ACTOR");
        System.out.println(productora.getActor("Rafa", "Mir"));
        System.out.println();
        System.out.println();
        System.out.println("MUESTRA PELICULA");
        System.out.println(productora.getPelicula("Deadpool"));
        System.out.println("BORRA PELICULA Y MUESTRA PELICULA BORRADA");
        productora.removePelicula("Deadpool");
        System.out.println(productora.getPelicula("Deadpool"));
        System.out.println(productora.getActores(p4));
        System.out.println();
        System.out.println();
        System.out.println("MUESTRA ACTORES DE UNA PELICULA");
        System.out.println(productora.getActores(p2));
        System.out.println();
        System.out.println();
        System.out.println("MUESTRA PELICULAS REALIZADAS POR UN ACTOR");
        System.out.println(productora.getPeliculas(a5));

        productora.guardarDatos();

        productora.cargarDatos();
    }
}
