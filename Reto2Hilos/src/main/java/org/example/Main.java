package org.example;

public class Main {
    public static void main (String[]args){
         // Array base
        int[] numeros = {23, 13, 15};
        // Array resultados
        int[] resultado = new int[numeros.length];

        // Crear y ejecutar los hilos
        Thread[] hilos = new Thread[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            hilos[i] = new Sumatorio(numeros[i], resultado, i);
            hilos[i].start();
        }

        // Finalizar hilos
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Sumar los resultados y dividir entre 8
        int sumaTotal = 0;
        for (int res : resultado) {
            sumaTotal += res;
        }
        double resultadoFinal = sumaTotal / 8.0;

        // Mostrar
        System.out.println("Sumas impares: " + java.util.Arrays.toString(resultado));
        System.out.println("El resultado final es: " + resultadoFinal);
    }

}

