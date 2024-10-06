package co.edu.uniquindio.poo;
import java.util.List;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private List<EmpleadoPorHora> listaEmpleadosPorHora;
    private List<EmpleadoTiempoCompleto> listaEmpleadosTiempoCompleto;
    private List<EmpleadoFreelance> listaEmpleadoFreelance;

    /**
     * Metodo constructor de la clase Empresa
     * @param nombre Nombre de la empresa a crear
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        listaEmpleadosPorHora = new LinkedList<>();
        listaEmpleadosTiempoCompleto = new LinkedList<>();
        listaEmpleadoFreelance = new LinkedList<>();
    }

    /**
     * Metodo para obtener el nombre de la empresa
     * @return Nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener la lista de empleados por hora de la empresa
     * @return Lista de empleados por hora de la empresa
     */
    public List<EmpleadoPorHora> getListaEmpleadosPorHora() {
        return listaEmpleadosPorHora;
    }
    /**
     * Metodo para obtener la lista de empleados de tiempo completo de la empresa
     * @return Lista de empleados de tiempo completo de la empresa
     */
    public List<EmpleadoTiempoCompleto> getListaEmpleadosTiempoCompleto() {
        return listaEmpleadosTiempoCompleto;
    }
    /**
     * Metodo para obtener la lista de empleados freelance de la empresa
     * @return Lista de empleados freelance de la empresa
     */
    public List<EmpleadoFreelance> getListaEmpleadoFreelance() {
        return listaEmpleadoFreelance;
    }

    /**
     * Metodo para modificar el nombre de la empresa
     * @param nombre Nuevonombre de la empresa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la lista de empleados por hora de la empresa
     * @param listaEmpleadosPorHora Nueva lista de empleados por hora de la empresa
     */
    public void setListaEmpleadosPorHora(List<EmpleadoPorHora> listaEmpleadosPorHora) {
        this.listaEmpleadosPorHora = listaEmpleadosPorHora;
    }
    /**
     * Metodo para modificar la lista de empleados de tiempo completo de la empresa
     * @param listaEmpleadosTiempoCompleto Nueva lista de empleados de tiempo completo de la empresa
     */
    public void setListaEmpleadosTiempoCompleto(List<EmpleadoTiempoCompleto> listaEmpleadosTiempoCompleto) {
        this.listaEmpleadosTiempoCompleto = listaEmpleadosTiempoCompleto;
    }
    /**
     * Metodo para modificar la lista de empleados freelance de la empresa
     * @param listaEmpleadoFreelance Nueva lista de empleados freelance de la empresa
     */
    public void setListaEmpleadoFreelance(List<EmpleadoFreelance> listaEmpleadoFreelance) {
        this.listaEmpleadoFreelance = listaEmpleadoFreelance;
    }
    
}