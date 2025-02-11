package Ejercicio2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "fichero.bin";
        int opcion;

        do{

            System.out.println("1. Crear archivo binario con información personal");
            System.out.println("2. Mostrar contenido del archivo binario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    crearArchivoBinario(nombreArchivo);
                    break;
                case 2:
                    mostrarContenidoArchivo(nombreArchivo);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while (opcion!=3);
    }

    public static void crearArchivoBinario(String nombreArchivo) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo));
            dos.writeUTF("Raúl");
            dos.writeInt(30); // Tu Edad
            dos.writeUTF("Huelva");
            System.out.println("Archivo binario creado con éxito.");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: ");
            e.printStackTrace();
        }
    }

    public static void mostrarContenidoArchivo(String nombreArchivo) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo));
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe. Por favor, crea el archivo primero.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: ");
            e.printStackTrace();
        }
    }
}
