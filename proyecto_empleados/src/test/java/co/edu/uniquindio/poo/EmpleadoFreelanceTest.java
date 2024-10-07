package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class EmpleadoFreelanceTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoFreelanceTest.class.getName());

    /**
     * Test para verificar si se calcula correctamente el salario de un empleado freelance
     */
    @Test
    public void testCalcularSalarioEmpleadoFreelance() {
        LOG.info("Iniciado test calcular salario del empleado freelance");
        Empresa empresa = new Empresa("Empresa prueba");
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Alejandro", "1092850000", 4, 4000);
        empresa.agregarEmpleadoFreelance(empleadoFreelance);
        assertEquals(16000, empleadoFreelance.calcularSalario());
        LOG.info("Finalizando test calcular salario del empleado freelance");
    }
}