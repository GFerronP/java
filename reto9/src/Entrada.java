public class Entrada {
    public static void main(String[] args) {

        Equipo equipoLocal=new Equipo("EquipoLocal");
        Equipo equipoVisitante=new Equipo("EquipoVisitante");
        Partido partido=new Partido(equipoLocal,equipoVisitante);
        partido.iniciarPartido(equipoLocal,equipoVisitante);
        partido.mostrarResultado(equipoLocal,equipoVisitante);
    }
}