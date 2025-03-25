package ejercicio50;

public class Piano extends Instrumento {

    // Sobrescritura del método tocar para el piano
    @Override
    public void tocar() {
        System.out.println("El piano está sonando con notas melodiosas.");
    }
}