package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double salarioPorHora;

    /**
     * Metodo constructor de la clase empleado por hora
     * @param nombre Nombre del empleado por hora a crear
     * @param identificacion Identificacion del empleado por hora a crear
     * @param horasTrabajadas Horas trabajados del empleado por hora a crear
     * @param salarioPorHora Salario por hora del empleado por hora a crear
     */
    public EmpleadoPorHora(String nombre, String identificacion, int horasTrabajadas, double salarioPorHora) {
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    /**
     * Metodo para obtener las horas trabajadas del empleado por hora
     * @return Horas trabajadas del empleado por hoja
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    /**
     * Metodo para obtener el salario por hora del empleado por hora
     * @return Salario por hora del empleado por hora
     */
    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    /**
     * Metodo para modificar las horas trabajadas del empleado por hora
     * @param horasTrabajadas Nuevas horas trabajadas del empleado por hora
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    /**
     * Metodo para modificar el salario por hora del empleado por hora
     * @param salarioPorHora Nuevo salario por hora del empleado por hora
     */
    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    /**
     * Metodo para calcular el salario del empleado por hora
     */
    @Override
    public double calcularSalario() {
        double salarioTotal = salarioPorHora*horasTrabajadas;
        return salarioTotal;
    }
    
    /**
     * Metodo para retornar la informacion de un empleado por hora
     */
    public String toString(){
        String info = "\nEmpleado por hora: " + "Nombre=" + super.getNombre() + ", Identificacion=" + super.getIdentificacion() + "\nHoras trabajadas=" + horasTrabajadas + ", Salario por hora=" + salarioPorHora;
        return info;
    }
}