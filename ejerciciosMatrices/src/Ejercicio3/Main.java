package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduzca el valor de [" + i + "][" + j + "]");
                matriz[i][j] = scn.nextInt();
            }
        }

        System.out.println("Muestreo de la matriz normal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Muestreo de la matriz traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
