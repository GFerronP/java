package Ejercicio1;

import java.util.Scanner;

public class Dni {
    private int dni;
    private char letra;
    public Dni(){

    }
    public Dni(int dni){
        this.dni=dni;
        this.letra=letraDni(dni);
    }
    private char letraDni(int dni){
        char [] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int x=(dni%23);
        char letraDni=letra[x];
        return letraDni;
    }
    public void leer(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Introduce el numero de dni");
        this.dni=scn.nextInt();
        this.letra=letraDni(dni);
        System.out.println("La letra del DNI: "+dni+" es "+letra);
    }
    public String toString(){
        return dni+"-"+letra;
    }
}
