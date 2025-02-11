package Ejercicio1;

public class Operario extends Empleado{

    public Operario(){

    }
    public Operario(String nombre){
        super (nombre);
    }


    public String toString(){
        return super.toString()+"--> Operario";
    }
}
