package ejercicio74;

public class Pajaro implements Volador {

    @Override
    public void despegar() {
        System.out.println("El pájaro ha levantado vuelo.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El pájaro ha aterrizado en una rama.");
    }
}
