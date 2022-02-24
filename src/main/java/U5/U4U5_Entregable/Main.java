package U5.U4U5_Entregable;

public class Main {
    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Avatar", "Paquito", 3.2,"Disney",2010,"EEUU");
        Libro libro1 = new Libro("Harry Potter y la piedra filosofal","JK.Rowling","Bloomsbury Publishing","978-1234-5678-97",1997,378);
        Serie serie2 = new Serie("Breaking bad", "Oscar", 10, 2034);
        Pelicula peli2 = new Pelicula("2 Fast 2 Furious", "Joselito", 2,"Disney",2006,"EEUU");
        Libro libro2 = new Libro("Harry Potter y la camara secreta","JK.Rowling","Bloomsbury Publishing","64-664-335-3656",1999,459);
        Pelicula peli3 = new Pelicula("Campeones", "Maria", 1.4,"Mediaset",2017,"España");
        Libro libro3 = new Libro("Harry Potter y el prisionero de Azkaban","JK.Rowling","Bloomsbury Publishing","849-867-0190",2000,345);
        Serie serie1 = new Serie("La casa de papel","Oscar",7,2016);
        Serie serie3 = new Serie("Shameless", "Juanlu", 4,2010);


        serie1.add_capitulo("S01E01");
        serie1.add_capitulo("S01E02");
        serie1.add_capitulo("S01E03");
        serie1.add_capitulo("S01E04");
        serie1.add_capitulo("S01E05");
        serie1.add_capitulo("S01E06");
        serie1.mostrarCapitulos();
        System.out.println(serie1.eliminar_capitulo("S01E05"));
        System.out.println();
        serie1.mostrarCapitulos();
        System.out.println();
        serie1.dar_por_finalizado();

        Catalogo cat1 = new Catalogo();

        cat1.add_multimedia(peli1);
        cat1.add_multimedia(peli2);
        cat1.add_multimedia(serie1);
        cat1.add_multimedia(serie2);
        cat1.add_multimedia(libro1);
        cat1.add_multimedia(libro2);
        cat1.add_multimedia(libro3);

        System.out.println(cat1);
        System.out.println(cat1.eliminar_multimedia(libro2));
        System.out.println(cat1);

        peli1.play();
        peli1.pause();
        peli1.stop();
        serie1.play();
        serie1.pause();
        serie1.stop();
        System.out.println();

        cat1.ordenar_por_id();
        System.out.println(cat1);
        System.out.println();
        cat1.ordenar_por_titulo();
        System.out.println(cat1);
        System.out.println();
        cat1.ordenar_por_anyo();
        System.out.println(cat1);
        System.out.println();

        System.out.println("El numero de elementos introducidos es: " + cat1.numero_de_elementos() );
    }
}
