public class Partido extends Equipo {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int parteActual;
    private boolean terminado;


    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void marcarGol(Equipo equipoLocal, Equipo equipoVisitante) {
        if (equipoLocal.atacar() == true && equipoLocal.getNivelAtaque() > equipoVisitante.getNivelDefensa()) {
            System.out.println("Gol del equipo " + equipoLocal.getNombre());
            equipoLocal.setNumeroGoles(equipoLocal.getNumeroGoles() + 1);
        } else {
            System.out.println("No ha marcado " + equipoLocal.getNombre());
        }
    }

    public void iniciarPartido(Equipo equipoLocal, Equipo equipoVisitante) {
        parteActual = 1;
        for (int i = 0; i < 2; i++) {
            System.out.println("Parte " + parteActual);
            parteActual++;
            for (int j = 0; j < 3; j++) {
                marcarGol(equipoLocal, equipoVisitante);
                marcarGol(equipoVisitante, equipoLocal);
            }
        }
        terminado = true;
        System.out.println("Partido finalizado");
    }

    public void mostrarResultado(Equipo equipoLocal, Equipo equipoVisitante) {
        if (terminado==true) {
            System.out.println("El partido entre " + equipoLocal.getNombre() + " y " + equipoVisitante.getNombre() + " ha terminado con un resultado de " + equipoLocal.getNumeroGoles()+" a " + equipoVisitante.getNumeroGoles());
        } else {
            System.out.println("Sin jugar o jugando");
        }
    }
    public Equipo getEquipoLocal(Equipo equipoLocal){
        return equipoLocal;
    }
    public Equipo getEquipoVisitante(Equipo equipoVisitante){
        return equipoVisitante;
    }
    public boolean isTerminado(){
        return terminado;
    }
    public int getParteActual(){
        return parteActual;
    }
}

