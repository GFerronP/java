public class Coche {
    private String marca;
    private String matricula;
    private int cv;
    private int velocidad;
    private double km;

    public Coche(){
        marca="Sin especificar";
        matricula="0000AAA";
        cv=0;
        velocidad=0;
        km=0.0;

    }
    public Coche(String matricula,String marca,int cv){
        this.matricula=matricula;
        this.marca=marca;
        this.cv=cv;

    }
    public String toString(){
        return "El coche de la marca "+this.marca+" y matricula "+this.matricula+" tiene "+this.cv+" cv, circula a "+this.velocidad+"km/h y tiene "+this.km+"km.";
    }

    //Getters
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public int getCv() {
        return cv;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public double getKm() {
        return km;
    }

    //Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public void setVelocidad(int velocidad) {
        if (velocidad<0){
            velocidad=0;
        } else if (velocidad>180) {
            velocidad=180;
        }else {
            this.velocidad = velocidad;
        }
    }
    public void setKm(double km) {
        if (km<0){
            km=0;
        }else {
            this.km = km;
        }
    }
    public void acelerar(int velocidadAcelerar){
        double avanzado=0;
        velocidad+=velocidadAcelerar;
        if (velocidad>180) {
            velocidad = 180;
            System.out.println("Velocidad maxima alcanzada, 180km/h");
            avanzado=avanzado(velocidad,cv);
        } else if (velocidadAcelerar<=0) {
            System.out.println("El coche no acelera");
            avanzado=avanzado(velocidad,cv);
        } else{
            System.out.println("La velocidad actual es: "+velocidad+"km/h");
            avanzado=avanzado(velocidad,cv);
        }
        km+=avanzado;
        System.out.println("Los km actuales son: "+km);
    }
    public double avanzado(int vel,int cv) {
        double avanzado = velocidad * (cv * (int) ((Math.random() * 10) + 1));
        System.out.println("Los km avanzados son: " +avanzado);
        return avanzado;
    }

    //frenar
    public void frenar(int freno){
        velocidad-=freno;
        if(velocidad<0) {
            velocidad = 0;
            System.out.println("Velocidad minima alcanzada");
        }else{
            System.out.println("La velocidad actual es: "+velocidad+"km/h");
        }
    }

    //parar
    public void parar(){
        velocidad=0;
    }

    //Reset datos
    public void reset(){
        velocidad=0;
        km=0;
    }

}
