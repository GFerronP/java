import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Calendar calendariouno= Calendar.getInstance();
        int mes;
        int ano;

        System.out.println("Introduce el año que quieres consultar");
        ano=scn.nextInt();
        System.out.println("Introduce el mes que quieres consultar");
        mes= scn.nextInt();
        dias();
        mostrardias(ano,mes);
    }
    static void dias(){
        System.out.print("D\tL\tM\tX\tJ\tV\tS\n");
    }
    static int diasmes(int ano,int mes){
        int dias=0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;

        }else if (mes == 2) {
            dias=bisiesto(ano);
        }else if(mes==4 || mes==6 || mes==9 || mes==11) {
            dias=30;
        }
        return dias;
    }
    static int bisiesto(int ano){
            int dias;
            if (ano%4==0){
                dias=29;
            } else {
                 dias=28;

            }
            return dias;

        }
    static void mostrardias(int ano, int mes){
        int cont=calend(ano, mes)-1;
        int cont2=calend(ano,mes);
        for (int j=cont2;j>1;j--){
            System.out.print(" \t");
        }
        for (int i=1; i<diasmes(ano,mes)+1; i++){
            System.out.print(i+"\t");
            cont++;
            if (cont==7) {
                System.out.println();
                cont = 0;
            }

        }

    }
    static  int calend(int ano, int mes){
        Calendar calendario= Calendar.getInstance();
        calendario.set(Calendar.YEAR,ano);
        calendario.set(Calendar.MONTH,mes-1);
        calendario.set(Calendar.DAY_OF_MONTH,1);
        int dia= calendario.get(Calendar.DAY_OF_WEEK);
        return dia;
    }

}