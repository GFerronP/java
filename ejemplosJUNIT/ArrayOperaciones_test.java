package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayOperaciones_test {

    @Test
    public void testEncontrarMaximo() {
        ArrayOperaciones arrayOperaciones = new ArrayOperaciones();
        int[] array = {1, 3, 7, 4, 2};
        assertEquals(7, arrayOperaciones.encontrarMaximo(array));
    }


    @Test
    public void testSumarElementos() {
        ArrayOperaciones arrayOperaciones = new ArrayOperaciones();
        int[] array = {1, 3, 5};
        assertEquals(9, arrayOperaciones.sumarElementos(array));
    }

    @Test
    public void testCalcularPromedio() {
        ArrayOperaciones arrayOperaciones = new ArrayOperaciones();
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, arrayOperaciones.calcularPromedio(array), 0.01); // Utilizamos delta para tolerar pequeñas diferencias debido a errores de redondeo
    }

    @Test
    public void testContieneElemento() {
        ArrayOperaciones arrayOperaciones = new ArrayOperaciones();
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(arrayOperaciones.contieneElemento(array, 3));
        assertFalse(arrayOperaciones.contieneElemento(array, 6));
    }
}
