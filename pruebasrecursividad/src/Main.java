import java.util.Scanner;

public class Main {
    private int numero;
    Scanner scn = new Scanner(System.in);


    public static void main(String[] args) {
        Main operacion=new Main();
        int numero=operacion.lecturaNumero();
        operacion.imprimirCuenta(numero);
    }


    private int lecturaNumero(){
        System.out.println("Introduce el numero");
        numero=scn.nextInt();
        return numero;
        }
    private void imprimirCuenta(int numero){
        System.out.println("Cuenta "+numero);
        if (numero>0){
            imprimirCuenta(numero-1);

        }
    }

}