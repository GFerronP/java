import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacion op1=new Operacion();
        Operacion op2=new Operacion();
        Operacion op3=new Operacion();
        Main main1=new Main();
        op1.num1=10;
        op1.num2= 5;
        op2.num1=3;
        op2.num2=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Introduce el valor de num1");
        op3.num1=scn.nextInt();
        System.out.println("Valor num2");
        op3.num2= scn.nextInt();

        System.out.println(op1.sumar());
        System.out.println(op1.restar());
        System.out.println(op1.multiplicar());
        System.out.println(op1.division());

        main1.holaMundo();

        holamundo2();

        op1.mostrarResultados();
        op2.mostrarResultados();
        op3.mostrarResultados();

    }
    //SI QUITAMOS EL STATIC TENEMOS QUE DECLARAR UN OBJETO PARA PODER LLAMARLO
    void holaMundo(){
        System.out.println("hola mundo");
    }
    static void holamundo2(){
        System.out.println("con static");
    }
}