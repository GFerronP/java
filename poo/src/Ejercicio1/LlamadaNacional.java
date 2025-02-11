package Ejercicio1;

public class LlamadaNacional extends LlamadaLocal{
    private char destino;

    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion, char destino) {
        super(numeroOrigen, numeroDestino, duracion);
        this.destino=destino;
        this.getCoste()=calcularCoste(destino, duracion);
    }


    public double calcularCoste(char destino,double duracion){
        double coste=0;
        char a= a;
        char b=b;
        char c=c;
        if (destino==a){
            coste=(duracion*0.4)+0.5;
        } else if (destino==b) {
            coste=(duracion*0.5)+0.5;
        } else if( destino==c){
            coste=(duracion*0.7)+0.5;
        }
        return coste;
    }

}
