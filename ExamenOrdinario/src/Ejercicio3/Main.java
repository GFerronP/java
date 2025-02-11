package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[] temperaturas = new double[10];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 50;
        }
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Recorrer Array");
        System.out.println("2. Mostrar temperatura mas alta");
        System.out.println("3. Mostrar temperatura mas baja");
        System.out.println("4. Salir");
        int opcion = scn.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < temperaturas.length; i++) {
                    System.out.println(temperaturas[i] + "ºC");
                }
                break;
            case 2:
                double max = 0;
                for (int i = 0; i < temperaturas.length; i++) {
                    if (max < temperaturas[i]) {
                        max = temperaturas[i];
                    }
                }
                System.out.println("Temperatura maxima: " + max + "ºC");
                break;
            case 3:
                double min = 50;
                for (int i = 0; i < temperaturas.length; i++) {
                    if (min > temperaturas[i]) {
                        min = temperaturas[i];
                    }
                }
                System.out.println("Temperatura minima: " + min + "ºC");

            case 4:
                System.out.println("Saliendo");
                break;


        }
    }
}
