public class Operacion {
    // atributos

    int num1;

    int num2;


    //metodos

    public int sumar(){
        int suma;
        suma= num1 + num2;
        return suma;
    }
    public int restar(){
        int resta;
        resta= num1-num2;
        return resta;
    }
    public int multiplicar(){
        int multi;
        multi=num1*num2;
        return multi;
    }
    public int division(){
        int division;
        division=num1/num2;
        return division;
    }
    public void mostrarResultados(){
        System.out.println("El resultado de la suma de "+num1+" y "+num2+" es:"+sumar());
        System.out.println("El resultado de la resta de "+num1+" y "+num2+" es:"+restar());
        System.out.println("El resultado de la multiplicacion de "+num1+" y "+num2+" es:"+multiplicar());
        System.out.println("El resultado de la division de "+num1+" y "+num2+" es:"+division());
    }
}
