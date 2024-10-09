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
    
    /**
     * Metodo para agregar un empleado freelance a la lista de empleados freelance de la empresa
     * @param empleadoFreelance Empleado freelance que se busca agregar a la lista de empleados freelance de la empresa
     */
    public void agregarEmpleadoFreelance(EmpleadoFreelance empleadoFreelance){
        if (!verificarEmpleadoFreelance(empleadoFreelance.getIdentificacion())) {
            listaEmpleadoFreelance.add(empleadoFreelance);
        }
    }
    /**
     * Metodo para verificar si una identificacion es igual a otra en la lista de empleados freelance de la empresa
     * @param identificacion Identificacion a verificar en la lista de empleados freelance
     * @return Decision sobre si la identificacion esta repetida o no
     */
    public boolean verificarEmpleadoFreelance(String identificacion){
        boolean decision = false;
        for (EmpleadoFreelance empleadoFreelance : listaEmpleadoFreelance) {
            if (empleadoFreelance.getIdentificacion().equals(identificacion)) {
                decision = true;
            }
        }
        return decision;
    }
    /**
     * Metodo para eliminar un empleado freelance de la lista de empleados freelance de la empresa
     * @param identificacion Identificacion del empleado freelance que se busca eliminar
     */
    public void eliminarEmpleadoFreelance(String identificacion){
        for (EmpleadoFreelance empleadoFreelance : listaEmpleadoFreelance) {
            if (empleadoFreelance.getIdentificacion().equals(identificacion)) {
                listaEmpleadoFreelance.remove(empleadoFreelance);
            }
        }
    }

    /**
     * Metodo para agregar un empleado por hora a la lista de empleados por hora de la empresa
     * @param EmpleadoPorHora Empleado por hora que se busca agregar a la lista de empleados por hora de la empresa
     */
    public void agregarEmpleadoPorHora(EmpleadoPorHora empleadoPorHora){
        if (!verificarEmpleadoPorHora(empleadoPorHora.getIdentificacion())) {
            listaEmpleadosPorHora.add(empleadoPorHora);
        }
    }
    /**
     * Metodo para verificar si una identificacion es igual a otra en la lista de empleados por hora de la empresa
     * @param identificacion Identificacion a verificar en la lista de empleados freelance
     * @return Decision sobre si la identificacion esta repetida o no
     */
    public boolean verificarEmpleadoPorHora(String identificacion){
        boolean decision = false;
        for (EmpleadoPorHora empleadoPorHora : listaEmpleadosPorHora) {
            if (empleadoPorHora.getIdentificacion().equals(identificacion)) {
                decision = true;
            }
        }
        return decision;
    }
    /**
     * Metodo para eliminar un empleado por hora de la lista de empleados por hora de la empresa
     * @param identificacion Identificacion del empleado por hora que se busca eliminar
     */
    public void eliminarEmpleadoPorHora(String identificacion){
        for (EmpleadoPorHora empleadoPorHora : listaEmpleadosPorHora) {
            if (empleadoPorHora.getIdentificacion().equals(identificacion)) {
                listaEmpleadosPorHora.remove(empleadoPorHora);
            }
        }
    }

    /**
     * Metodo para agregar un empleado de tiempo completo a la lista de empleados de tiempo completo de la empresa
     * @param EmpleadoTiempoCompleto Empleado de tiempo completo que se busca agregar a la lista de empleados de tiempo completa de la empresa
     */
    public void agregarEmpleadoTiempoCompleto(EmpleadoTiempoCompleto empleadoTiempoCompleto){
        if (!verificarEmpleadoTiempoCompleto(empleadoTiempoCompleto.getIdentificacion())) {
            listaEmpleadosTiempoCompleto.add(empleadoTiempoCompleto);
        }
    }
    /**
     * Metodo para verificar si una identificacion es igual a otra en la lista de empleados de tiempo completo de la empresa
     * @param identificacion Identificacion a verificar en la lista de empleados de tiempo completo
     * @return Decision sobre si la identificacion esta repetida o no
     */
    public boolean verificarEmpleadoTiempoCompleto(String identificacion){
        boolean decision = false;
        for (EmpleadoTiempoCompleto empleadoTiempoCompleto : listaEmpleadosTiempoCompleto) {
            if (empleadoTiempoCompleto.getIdentificacion().equals(identificacion)) {
                decision = true;
            }
        }
        return decision;
    }
    /**
     * Metodo para eliminar un empleado de tiempo completo de la lista de empleados de tiempo completo de la empresa
     * @param identificacion Identificacion del empleado de tiempo completo que se busca eliminar
     */
    public void eliminarEmpleadoTiempoCompleto(String identificacion){
        for (EmpleadoTiempoCompleto empleadoTiempoCompleto : listaEmpleadosTiempoCompleto) {
            if (empleadoTiempoCompleto.getIdentificacion().equals(identificacion)) {
                listaEmpleadosTiempoCompleto.remove(empleadoTiempoCompleto);
            }
        }
    }

    /**
     * Metodo para obtener la informacion de la empresa
     */
    @Override
    public String toString() {
        String info = "Empresa:\n" + "Nombre=" + nombre + "\n\nLista empleados freelance:";
        for (EmpleadoFreelance empleadoFreelance : listaEmpleadoFreelance) {
            info += empleadoFreelance.toString();
        }
        info += "\n\nLista empleados por hora:";
        for (EmpleadoPorHora empleadoPorHora : listaEmpleadosPorHora) {
            info += empleadoPorHora.toString();
        }
        info += "\n\nLista empleados tiempo completo:";
        for (EmpleadoTiempoCompleto empleadoTiempoCompleto : listaEmpleadosTiempoCompleto) {
            info += empleadoTiempoCompleto.toString();
        }
        return info;
    }
}