import java.util.Random;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario = 100000.0;
    private static int totalEmpleados = 0;

    Empleado(int id, String nombre, String puesto, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;

    }

    Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = generarId();
        totalEmpleados++;
    }

    private int generarId() {
        Random rand = new Random();
        return 1000 + rand.nextInt(4001);
    }

    public void actualizarSalario() {
        this.salario = Math.round(this.salario * 1.15);
    }

    public void actualizarSalario(double porcentajeAumento) {
        this.salario = (this.salario * (1 + porcentajeAumento/100.0));
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
