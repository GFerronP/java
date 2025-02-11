public class Equipo {

    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelCentro;
    private int numeroGoles;

    public Equipo() {

    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        nivelAtaque = (int) (Math.random() * 101);
        nivelDefensa = (int) (Math.random() * 101);
        nivelCentro = (int) (Math.random() * 101);
        numeroGoles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelDefensa, int nivelCentro, int numeroGoles) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.numeroGoles = numeroGoles;
    }


    //Ajusto el valor a 20 para aumentar el % de true que sale
    public boolean atacar() {
        boolean atacar;
        int ataque = 0;
        ataque = ((int) (Math.random() * 2)) + ((this.nivelCentro * (int) (Math.random() * 2)) / 2);
        if (ataque >= 20) {
            atacar = true;
        }else {
            atacar = false;
        }
        return atacar;
    }

    public String toString() {
        return "Nombre del jugador: " + nombre + "\nNivel ataque: " + nivelAtaque + "\nNivel defensa: " + nivelDefensa + "\nNivel centro: " + nivelCentro + "\nNumero de goles: " + numeroGoles;
    }


    //getters
    public String getNombre() {
        return nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }
}
