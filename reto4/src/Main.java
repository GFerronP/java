import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Reto4. Realiza un conversor de bases. Para ello se deberán seguir la siguiente
        secuencia de acciones:
            a. El sistema pedirá por consola un valor numérico el cual será el número en
            base10 (decimal) del que se quiere calcular su base2 (binario).
            b. El sistema realizará los cálculos necesarios para realizar el cambio
            (divisiones sucesivas entre 2)
            c. Por último, se mostrará por consola el numero traducido en base 2*/

        Scanner scn=new Scanner(System.in);
        int num;
        int conversor;
        String binario="";
        System.out.println("Introduce el numero que quieres convertir a binario");
        num=scn.nextInt();
        int muestra=num;

        do {
            conversor=num%2;
            binario=binario+conversor;
            //binario=String.valueOf(conversor)+binario;

        }
        while ((num/=2)!=0);
        System.out.println("El numero "+muestra+" en binario es: "+ binario);

    }
}