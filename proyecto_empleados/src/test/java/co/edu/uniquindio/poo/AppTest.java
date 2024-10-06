/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Test para verificar si se calcula correctamente el salario de un empleado freelance
     */
    @Test
    public void testCalcularSalarioEmpleadoFreelance() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        Empresa empresa = new Empresa("Empresa prueba");
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Alejandro", "1092850000", 4, 4000);
        empresa.agregarEmpleadoFreelance(empleadoFreelance);
        assertEquals(16000, empleadoFreelance.calcularSalario());
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    /**
     * Test para verificar si se calcula correctamente el salario de un empleado por hora
     */
    @Test
    public void testCalcularSalarioEmpleadoPorHora() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        Empresa empresa = new Empresa("Empresa prueba");
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Alejandro", "1092850000", 10, 2500);
        empresa.agregarEmpleadoPorHora(empleadoPorHora);
        assertEquals(25000, empleadoPorHora.calcularSalario());
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
