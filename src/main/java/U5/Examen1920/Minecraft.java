package U5.Examen1920;

import java.util.Arrays;

public class Minecraft{

    private Material[] material = new Material[0];

    void anadirMaterial(Material material){
        if (this.material.length<10){
            this.material = Arrays.copyOf(this.material,this.material.length+1);
            this.material[this.material.length-1] = material;
        }
    }

    void borrarMaterialSinMasa(){
        Material[] material1 = new Material[0];
        for (int i = 0; i < material.length; i++) {
            if (material[i].getMasa() != 0){
                material1 = Arrays.copyOf(material1,material1.length+1);
                material1[material1.length-1] = material[i];
            }
        }
        material = Arrays.copyOf(material, material1.length);
        for (int i = 0; i < material.length; i++) {
            material[i] = material1[i];
        }
    }

    void ultimoMaterialQueQueda(){
        int contador = 0;
        for (int i = 0; i < material.length; i++) {
            if (material[i].getMasa() == 0){
                contador++;
            }
        }
        if (contador == 1){
            for (int i = 0; i < material.length; i++) {
                if (material[i].getMasa() == 0){
                    System.out.println(material[i]);
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Minecraft{" +
                "material=" + Arrays.toString(material) +
                '}';
    }
    void MostrarEstado(){
        System.out.println(this);
    }

    public Material[] getMaterial() {
        return material;
    }

}
