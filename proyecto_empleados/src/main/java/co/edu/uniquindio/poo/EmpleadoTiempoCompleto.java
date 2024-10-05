package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado{
    private double salarioMensual;

    /**
     * Metodo constructor de la clase EmpleadoTiempoCompleto
     * @param nombre NNombre del empleado de tiempo completo a crear
     * @param identificacion Identificacion del empleado de tiempo completo a crear
     * @param salarioMensual Salario mensual del empleado de tiempo completo a crear
     */
    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual) {
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }
    
    /**
     * Metood para obtener el salario mensual del empleado a tiempo completo
     * @return Salario mensual del empleado a tiempo completo
     */
    public double getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * Metodo para modificar el salario mensual del empleado a tiempo completo
     * @param salarioMensual Nuevo salario mensual del empleado a tiempo completo
     */
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    /**
     * Metodo para retornar el salarioMensual del empleado
     */
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

}
