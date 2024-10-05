package co.edu.uniquindio.poo;

public class Empleado {
    private String nombre;
    private String identificacion;

    /**
     * Metodo constructor de la clase Empleado
     * @param nombre Nombre del empleado a crear
     * @param identificacion Identificacion del empleado a crear
     */
    public Empleado(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    
    /**
     * Metodo para obtener el nombre del empleado
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtneer la identificacion del empleado
     * @return
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Metodo para modificar el nombre del empleado
     * @param nombre Nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la identificacion del empleado
     * @param identificacion Nueva identificacion del empleado
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public abstract void calcularSalario();
}
