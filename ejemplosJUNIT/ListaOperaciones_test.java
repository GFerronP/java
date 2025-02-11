package org.example;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaOperaciones_test {

    @Test
    public void testEncontrarMaximo() {
        ListaOperaciones listaOperaciones = new ListaOperaciones();
        List<Integer> lista = Arrays.asList(1, 3, 7, 4, 2);
        assertEquals(7, listaOperaciones.encontrarMaximo(lista));
    }


    @Test
    public void testSumarElementos() {
        ListaOperaciones listaOperaciones = new ListaOperaciones();
        List<Integer> lista = Arrays.asList(1, 3, 5);
        assertEquals(9, listaOperaciones.sumarElementos(lista));
    }

    @Test
    public void testEliminarDuplicados() {
        ListaOperaciones listaOperaciones = new ListaOperaciones();
        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);
        List<Integer> resultadoEsperado = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(resultadoEsperado, listaOperaciones.eliminarDuplicados(lista));
    }
}
