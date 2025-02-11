package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        Scanner scn = new Scanner(System.in);

        System.out.println("Introducir datos de matriz 1");
        System.out.println("Matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Introduzca el valor para [" + i + "][" + j + "]");
                matriz1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Introducir datos Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Introduzca el valor para [" + i + "][" + j + "]");
                matriz2[i][j] = scn.nextInt();
            }
        }

        System.out.println("Mostrar datos de matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Introducir datos Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println();
        }

        System.out.println("Suma de las dos matrices");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
