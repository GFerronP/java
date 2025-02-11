import java.util.ArrayList;

public class Jugador{

    private String nombre;
    private String dni;
    private ArrayList<Carton> Cartones;
    private int saldo;
    private boolean ganador;

    public Jugador(String nombre,String dni,int saldo){
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=saldo;
        this.ganador=false;
    }
    public void recargarSaldo(int n){
        if (n>0){
            this.saldo=+n;
        }
    }

    public void verCartones(){
        for (int i=0;i<Cartones.size();i++){
            System.out.println("Carton numero "+(i+1));
            Cartones.get(i).verNumeros();
            System.out.println("");
        }
    }
    public void mostrarDatos(){
        System.out.println("Jugador: "+nombre);
        System.out.println("Saldo: "+saldo);
        verCartones();
    }
    public void comprobarNumeros(int num){
        for (int i=0;i<Cartones.size();i++){
            Cartones.get(i).comprobarNumero(num);
            if(Cartones.get(i).getNumaciertos()==10){
                System.out.println("Carton premiado, ha acertado todos!!");
                setGanador(true);
                Cartones.get(i).verNumeros();
            }
        }


    }
    public void comprarCartones(int cant){
        if ((saldo-cant)>=0){
            Cartones=new ArrayList<>();
            for (int i=0;i<cant;i++){
                Carton carton=new Carton();
                Cartones.add(carton);
            }
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public boolean isGanador(){
        return ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public ArrayList<Carton> getCartones() {
        return Cartones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setCartones(ArrayList<Carton> cartones) {
        Cartones = cartones;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
}
