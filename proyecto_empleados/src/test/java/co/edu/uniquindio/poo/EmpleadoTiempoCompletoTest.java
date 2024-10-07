package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class EmpleadoTiempoCompletoTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoTiempoCompletoTest.class.getName());

    /**
     * Test para verificar si se calcula correctamente el salario de un empleado a tiempo completo
     */
    @Test
    public void testCalcularSalarioEmpleadoTiempoCompleto() {
        LOG.info("Iniciado test calcular salario del empleado tiempo completo");
        Empresa empresa = new Empresa("Empresa prueba");
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Alejandro", "1092850000", 576890);
        empresa.agregarEmpleadoTiempoCompleto(empleadoTiempoCompleto);
        assertEquals(576890, empleadoTiempoCompleto.getSalarioMensual());
        LOG.info("Finalizando test calcular salario del empleado a tiempo completo");
    }
}