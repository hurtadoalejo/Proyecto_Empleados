package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Margarita");
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Alejandro", "1092850000", 450000);
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Veronica", "1036448000", 10, 7000);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Mariana", "25022000", 15, 30000);
        empresa.agregarEmpleadoTiempoCompleto(empleadoTiempoCompleto);
        empresa.agregarEmpleadoFreelance(empleadoFreelance);
        empresa.agregarEmpleadoPorHora(empleadoPorHora);
        System.out.println(empresa.toString());
    }
}
