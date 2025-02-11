package Ejercicio1;

public class LlamadaLocal {
    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private double duracion;

    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracion){
        this.numeroOrigen=numeroOrigen;
        this.numeroDestino= numeroDestino;
        this.duracion= duracion;
        this.coste=(duracion *0.15)+0.5;
    }

    public double getCoste() {
        return coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }
    public String toString(){
        return "Numero de origen: "+numeroOrigen+"\nNumero destino "+numeroDestino+"\nDuracion llamada "+duracion+"\nCoste llamada "+coste;
    }
}
