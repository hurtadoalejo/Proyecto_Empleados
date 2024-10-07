package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class EmpleadoPorHoraTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoPorHoraTest.class.getName());

    /**
     * Test para verificar si se calcula correctamente el salario de un empleado por hora
     */
    @Test
    public void testCalcularSalarioEmpleadoPorHora() {
        LOG.info("Iniciado test calcular salario del empleado por hora");
        Empresa empresa = new Empresa("Empresa prueba");
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Alejandro", "1092850000", 10, 2500);
        empresa.agregarEmpleadoPorHora(empleadoPorHora);
        assertEquals(25000, empleadoPorHora.calcularSalario());
        LOG.info("Finalizando test calcular salario del empleado por hora");
    }
}