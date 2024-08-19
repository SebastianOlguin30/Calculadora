package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OperacionesMatematicasTest {

    OperacionesMatematicas operaciones = new OperacionesMatematicas();

    // Prueba para el método cuadrado
    @Test
    public void testCuadrado() {
        assertEquals(4, operaciones.cuadrado(2), "El cuadrado de 2 debe ser 4");
        assertEquals(0, operaciones.cuadrado(0), "El cuadrado de 0 debe ser 0");
        assertEquals(9, operaciones.cuadrado(-3), "El cuadrado de -3 debe ser 9");
    }

    // Prueba para el método esPrimo
    @Test
    public void testEsPrimo() {
        assertTrue(operaciones.esPrimo(5), "5 debe ser un número primo");
        assertFalse(operaciones.esPrimo(4), "4 no debe ser un número primo");
        assertFalse(operaciones.esPrimo(1), "1 no debe ser un número primo");
        assertFalse(operaciones.esPrimo(-3), "-3 no debe ser un número primo");
    }

    // Prueba para el método factorial
    @Test
    public void testFactorial() {
        assertEquals(120, operaciones.factorial(5), "El factorial de 5 debe ser 120");
        assertEquals(1, operaciones.factorial(0), "El factorial de 0 debe ser 1");
        assertEquals(1, operaciones.factorial(1), "El factorial de 1 debe ser 1");
        assertThrows(IllegalArgumentException.class, () -> operaciones.factorial(-1), "Debe lanzar una excepción para números negativos");
    }
}

