package U4.U4_T1;

public class Main {
    public static void main(String[] args) {


        ManoDeObra obreros1 = new ManoDeObra("Constructoras Unificadas Del Sur S.L.","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",3000,10);
        ManoDeObra obreros2 = new ManoDeObra("Constructoras Mallorquinas Consolidadas Sl","llllllllllllllllllllllllllllllll",4000,12);
        ManoDeObra obreros3 = new ManoDeObra("Edelbau Europa Sl","wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww",2800,7);

        Vivienda vivienda1 = new Vivienda("Calle Julio Cesar 15", 120);
        Vivienda vivienda2 = new Vivienda("Calle Andalucia 78", 150);
        Vivienda vivienda3 = new Vivienda("Calle Pepito", 50);

        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.BALCON);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.COCINA);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.COMEDOR);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.BANHO);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.BANHO);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);
        vivienda1.eliminarEstancia(5);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);
        vivienda1.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);

        vivienda2.anadirEstancia(Vivienda.estanciasVivienda.BALCON);
        vivienda2.anadirEstancia(Vivienda.estanciasVivienda.COCINA);
        vivienda2.anadirEstancia(Vivienda.estanciasVivienda.COMEDOR);
        vivienda2.anadirEstancia(Vivienda.estanciasVivienda.BANHO);
        vivienda2.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);
        vivienda2.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);

        vivienda3.anadirEstancia(Vivienda.estanciasVivienda.BALCON);
        vivienda3.anadirEstancia(Vivienda.estanciasVivienda.COCINA);
        vivienda3.anadirEstancia(Vivienda.estanciasVivienda.COMEDOR);
        vivienda3.anadirEstancia(Vivienda.estanciasVivienda.BANHO);
        vivienda3.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);
        vivienda3.anadirEstancia(Vivienda.estanciasVivienda.DORMITORIO);

        Material material1 = new Material("aaaaaaaaaaaaaaaaaaaaaaaaa", 5, 2.5);
        Material material2 = new Material("bbbbbbbbbbbbbbbbbbbbbbbbb", 9, 8);
        Material material3 = new Material("ccccccccccccccccccccccccccccca", 25, 8.5);
        Material material4 = new Material("ffffffffffffffffffffffffffffffff", 12, 23.8);

        Material material5 = new Material("hghhhhhhhhhhhhhhhhhhhhhhhh"," Hogarizando", 34, 75);
        Material material6 = new Material("gggggggggggggggggggggggggggg","Dulce Hogar", 23, 235);
        Material material7 = new Material("ppppppppppppppppppppppppppp", "Dulce Hogar",86, 32);
        Material material8 = new Material("aaasdaaaaaaaaaaaaaaaaaaaaaaaaaa","Strong House", 2, 25);
        Material material9 = new Material("iiiiiiiiiiiiiiiiiiiiiiiiiia","Strong House", 5, 53.6);

        Obra obra1 = new Obra(vivienda1,obreros1, Vivienda.estanciasVivienda.BANHO);
        Obra obra2 = new Obra(vivienda2,obreros3, Vivienda.estanciasVivienda.COMEDOR);
        Obra obra3 = new Obra(vivienda3, obreros2, Vivienda.estanciasVivienda.DORMITORIO);

        obra1.anadirMaterial(material1);
        obra1.anadirMaterial(material2);
        obra1.anadirMaterial(material3);
        obra1.mostrar_informacion();
        obra1.eliminarMaterial(2);


        obra2.anadirMaterial(material4);
        obra2.mostrar_informacion();
        obra2.anadirMaterial(material5);
        obra2.eliminarMaterial(0);

        System.out.println(Material.getIVA()+ "%");
        Material.setIVA(15);
        System.out.println(Material.getIVA()+ "%");

        obra3.anadirMaterial(material6);
        obra3.anadirMaterial(material7);
        obra3.anadirMaterial(material8);
        obra3.mostrar_informacion();
        obra3.eliminarMaterial(1);
        vivienda3.eliminarEstancia(0);
        obra3.anadirMaterial(material9);

        obra3.mostrar_informacion();

        System.out.println(Material.getIVA()+ "%");
        Material.setIVA(15);
        System.out.println(Material.getIVA()+ "%");
    }
}
