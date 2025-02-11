import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el valor de numeroUno: ");
        int numeroUno=scanner.nextInt();
        System.out.println("Introduce el valor de numeroDos: ");
        int numeroDos=scanner.nextInt();
        int suma;
        int resta,multiplicacion;
        double division;
        float resto;
        suma=numeroUno+numeroDos;
        System.out.printf("El valor de la suma de %d y %d es: %d%n",numeroUno,numeroDos,suma);
        resta=numeroUno-numeroDos;
        System.out.printf("El valor de la resta de %d y %d es: %d%n",numeroUno,numeroDos,resta);
        multiplicacion=numeroUno*numeroDos;
        System.out.printf("El valor de la multiplicacion de %d y %d es: %d%n",numeroUno,numeroDos,multiplicacion);
        resto=numeroUno%numeroDos;
        System.out.printf("El valor del resto es %.2f%n",resto);
        division=numeroUno/numeroDos;
        System.out.printf("El valor de la division de %d y %d es: %.2f%n",numeroUno,numeroDos,division);
        boolean mayorque=suma<resta;
        System.out.printf("Suma mayor que resta: %b%n",mayorque);
        boolean menorque=suma>resta;
        System.out.printf("Suma menor que resta: %b%n",menorque);

    }
}