package U5.Examen1920;

public interface Minar {
    default void Hacer(Material material) {
        material.setMasa(material.getMasa()+100);
    }

    default void Deshacer(Material material) {
        material.setMasa(material.getMasa()-100);
    }
}
