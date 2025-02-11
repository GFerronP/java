package org.example;

public class ArrayOperaciones {

    public int encontrarMaximo(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array está vacío");
        }

        int maximo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public int sumarElementos(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    public double calcularPromedio(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array está vacío");
        }

        double suma = sumarElementos(array);
        return suma / array.length;
    }

    public boolean contieneElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }
}

