package co.edu.uniquindio.poo;

public class EmpleadoFreelance extends Empleado{
    private int proyectosCompletados;
    private double pagoPorProyecto;

    /**
     * Metodo constructor de la clase EmpleadoFreelance
     * @param nombre Nombre del empleado freelance a crear
     * @param identificacion Identificacion del empleado freelance a crear
     * @param proyectosCompletados Numero de proyectos completados del empleado freelance a crear
     * @param pagoPorProyecto Pago por proyecto del empleado freelance a crear
     */
    public EmpleadoFreelance(String nombre, String identificacion, int proyectosCompletados, double pagoPorProyecto) {
        super(nombre, identificacion);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    /**
     * Metodo para obtener la cantidad de proyectos completados del empleado freelance
     * @return Cantidad de proyectos completados del empleado freelance
     */
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }
    /**
     * Metodo para obtener el pago por proyecto del empleado freelance
     * @return Pago por proyecto del empleado freelance
     */
    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    /**
     * Metodo para modificar la cantidad de proyectos completados del empleado freelance
     * @param proyectosCompletados Nueva cantidad de proyectos completados del empleado freelance
     */
    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }
    /**
     * Metodo para modificar el pago por proyecto del empleado freelance
     * @param pagoPorProyecto Nuevo pago por proyecto del empleado freelance
     */
    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    /**
     * Metodo para calcular el salario del empleado freelance
     */
    @Override
    public double calcularSalario() {
        double salarioTotal = proyectosCompletados*pagoPorProyecto;
        return salarioTotal;
    }

    /**
     * Metodo para retornar la informacion de un empleado freelance
     */
    public String toString(){
        String info = "\nEmpleado Freelance: " + "Nombre=" + super.getNombre() + ", Identificacion=" + super.getIdentificacion() + "\nProyectos completados=" + proyectosCompletados + ", Pago por proyecto=" + pagoPorProyecto;
        return info;
    }
}