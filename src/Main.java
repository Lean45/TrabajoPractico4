public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("leandro", "Estudiante");
        Empleado emp2 = new Empleado(2354, "luciana", "pastelera", 150000);

        emp1.actualizarSalario();
        emp2.actualizarSalario(10);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        System.out.println(Empleado.mostrarTotalEmpleados());
    }
}