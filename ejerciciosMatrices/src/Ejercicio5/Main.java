package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int filas, columnas;
        boolean simetrica = false;

        System.out.println("Numero de filas: ");
        filas = scn.nextInt();

        System.out.println("Numero de columnas ");
        columnas = scn.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduzca el número para [" + i + "][" + j + "]");
                matriz[i][j] = scn.nextInt();
            }
        }

        if (filas == columnas) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] == matriz[j][i]) {
                        simetrica = true;
                    }
                }
            }
        }
        if (simetrica) {
            System.out.println("Es una matriz simetrica");
        } else {
            System.out.println("No es una matriz simetrica");
        }
    }
}
