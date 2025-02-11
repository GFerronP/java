import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales
         indicarlo también. Ves cambiando los valores para comprobar que funciona.*/
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce el valor de num1");
        int num1=scn.nextInt();
        System.out.println("Introduce el valor de num2");
        int num2= scn.nextInt();
        if (num1<num2){
            System.out.println("num1 es menor que num2");
        }
        else if (num1==num2) {
            System.out.println("num1 y num2 son iguales");
        } else if (num1>num2) {
            System.out.println("num1 es mayor que num2");

        }
    }
}