import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el valor del producto:");
        float precio=scanner.nextFloat();
        System.out.println("Introduce el valor de IVA");
        int iva=scanner.nextInt();
        float coniva=precio+((precio*iva)/100);


        System.out.printf("Precio producto sin IVA: %.2f%n",precio);
        System.out.printf("IVA del producto: %d%nEl precio final es: %.2f",iva,coniva);
    }
}