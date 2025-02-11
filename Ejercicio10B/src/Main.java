import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double saldoInicial = 1000;
        double ingreso;
        double retiro;
        int operacion;
        double saldo;

        System.out.println("¿Que operación desea realizar?:");
        System.out.println("1.- Ingresar dinero");
        System.out.println("2.- Retirar dinero");
        System.out.println("3.- Salir");
        operacion = scn.nextInt();

        while (operacion != 1 && operacion != 2 && operacion != 3) {
            System.out.println("La opción es incorrecta, vuelva a introducirla");
            operacion = scn.nextInt();
        }

        switch (operacion) {
            case 1:
                System.out.println("Indice que cantidad que desea ingresar");
                ingreso = scn.nextDouble();
                saldo = saldoInicial + ingreso;
                System.out.printf("Su saldo actual es: %.2f €",saldo);
                break;
            case 2:
                System.out.println("Indice que cantidad que desea retirar");
                retiro = scn.nextDouble();
                while (retiro>saldoInicial){
                    System.out.println("No puede retirar más dinero del que tiene en la cuenta");
                    System.out.println("Introduzca otra cantidad");
                    retiro = scn.nextDouble();
                }
                    saldo = saldoInicial - retiro;
                    System.out.printf("Su saldo actual es: %.2f €",saldo);
                break;
            case 3:
                System.out.println("Gracias por usar nuestro servicio, que tenga un buen día");
                break;
        }
    }
}