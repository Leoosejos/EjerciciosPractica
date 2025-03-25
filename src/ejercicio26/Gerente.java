package ejercicio26;

public class Gerente extends Empleado {
    private String departamento;


    public Gerente(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void liderarEquipo() {
        System.out.println("El gerente está liderando el equipo del departamento " + departamento);
    }

    @Override
    public String toString() {
        return "Gerente [" + super.toString() + ", departamento=" + departamento + "]";
    }
}