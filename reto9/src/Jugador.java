public class Jugador {
    private String nombre;
    private String posicion;
    private boolean estrella;
    private int calidad;

    public Jugador(String nombre,String posicion,int calidad){
        this.nombre=nombre;
        this.posicion=posicion;
        this.calidad=calidad;
        if (calidad>90){
            this.estrella=true;
        }else {
            this.estrella=false;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }
    public String getNombre(){
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public int getCalidad() {
        return calidad;
    }
}
