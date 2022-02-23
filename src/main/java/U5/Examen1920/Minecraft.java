package U5.Examen1920;

import java.util.Arrays;

public class Minecraft {
    private Material[] material = new Material[0];

    void añadirMaterial(Material material){
        if (this.material.length<10){
            this.material = Arrays.copyOf(this.material,this.material.length+1);
            this.material[this.material.length-1] = material;
        }
    }

    void borrarMaterialSinMasa(){
        int contador = 0;
        Material[] material1 = new Material[0];
        for (int i = 0; i < material.length; i++) {
            if (material[i].getMasa() != 0){
                material1 = Arrays.copyOf(material1,material1.length+1);
                material1[material1.length-1] = material[i];
            }
        }
        
    }
}
