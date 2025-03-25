package ejercicio50;

public class Guitarra extends Instrumento {

    // Sobrescritura del método tocar para la guitarra
    @Override
    public void tocar() {
        System.out.println("La guitarra está sonando con acordes vibrantes.");
    }
}