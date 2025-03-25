package ejercicio26;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int id, double salario, String lenguajeProgramacion) {
        super(nombre, id, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void programar() {
        System.out.println("El desarrollador está programando en " + lenguajeProgramacion);
    }

    @Override
    public String toString() {
        return "Desarrollador [" + super.toString() + ", lenguajeProgramacion=" + lenguajeProgramacion + "]";
    }
}