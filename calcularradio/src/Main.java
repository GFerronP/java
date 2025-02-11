import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar
         de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.*/
        Scanner scn=new Scanner(System.in);
        System.out.println("Introduce el radio del circulo");
        double radio=scn.nextDouble();
        double area=Math.PI*Math.pow(radio,2);
        System.out.printf("El area del circulo con radio %.2f es %.2f",radio,area);
    }
}