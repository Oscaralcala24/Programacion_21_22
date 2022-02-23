package U5.Examen1920;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Minecraft mine1 = new Minecraft();
        Cristal cristal1 = new Cristal("aaaaaa",25, 13,98,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cristal2 = new Cristal("aaaaaa",1445, 13,98,true, Cristal.tipoCristal.TRASPARENTE);
        Cristal cristal3 = new Cristal("aaaaaa",45, 13,98,true, Cristal.tipoCristal.TRASPARENTE);
        Cristal cristal4 = new Cristal("aaaaaa",19, 35,64,false, Cristal.tipoCristal.TRANSLUCIDO);
        Pico pico1 = new Pico("aaaaaa",25, 13,98,true,54);
        pico1.Hacer(cristal1);
        mine1.anadirMaterial(cristal1);
        mine1.anadirMaterial(cristal2);
        mine1.anadirMaterial(cristal3);
        mine1.anadirMaterial(cristal4);

        mine1.MostrarEstado();
        System.out.println();
        mine1.ultimoMaterialQueQueda();
        System.out.println();
        mine1.MostrarEstado();
        System.out.println();

        Arrays.sort(mine1.getMaterial());
        mine1.MostrarEstado();



    }
}
