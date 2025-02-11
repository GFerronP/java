import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int horas,minutos,segundos;
        System.out.println("Introduce el numero de segundos");
        int numeroseg=scanner.nextInt();
        horas=numeroseg/3600;
        minutos=(numeroseg-(3600*horas))/60;
        segundos=numeroseg-((3600*horas)+(60*minutos));
        System.out.printf("Numero de segundos introducido es %d%n Las horas %d%n Los minutos son %d%n Los segundo %d",numeroseg,horas,minutos,segundos);
    }
}