package Ejercicio1;

public class Directivo extends Empleado{

    public Directivo(){

    }
    public Directivo(String nombre){
        super(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre()+"--> Directivo";
    }
}
