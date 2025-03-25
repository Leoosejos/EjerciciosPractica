package ejercicio49;

import java.util.List;

public class UtilidadesAnimal {
    public static void reproducirSonidos(List<Animal> animales) {
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
