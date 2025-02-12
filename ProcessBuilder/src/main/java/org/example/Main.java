package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{

            //Introducimos la ruta
            System.out.println("Por favor, introduce la ruta ejecutable:");
            String ruta = sc.nextLine();

            // C:\\\\Program Files\\\\BraveSoftware\\\\Brave-Browser\\\\Application\\\\brave.exe"

            //Introducimos el tiempo de espera
            System.out.print("Introduce el tiempo de espera en segundos: ");
            int waitTimeInSeconds = sc.nextInt();

            // Convertimos el tiempo de espera a milisegundos
            int waitTimeInMillis = waitTimeInSeconds * 1000;

            System.out.println("Esperando " + waitTimeInSeconds + " segundos.");
            Thread.sleep(waitTimeInMillis); // Pausar el programa

            // Creamos el ProcessBuilder
            ProcessBuilder pb = new ProcessBuilder(ruta);

            // Para lanzar el proceso debemos utilizar el metodo start
            pb.start();
        }catch (IOException e){
            System.out.println(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
