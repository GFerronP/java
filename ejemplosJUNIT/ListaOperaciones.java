package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaOperaciones {

    public int encontrarMaximo(List<Integer> lista) {

        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía");
        }

        int maximo = lista.get(0);
        for (int num : lista) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public int sumarElementos(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public List<Integer> eliminarDuplicados(List<Integer> lista) {
        List<Integer> resultado = new ArrayList<>();
        for (int num : lista) {
            if (!resultado.contains(num)) {
                resultado.add(num);
            }
        }
        return resultado;
    }
}

