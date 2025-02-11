import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Jugador jugador1=new Jugador("Pepe","9489984s",10);


        jugador1.recargarSaldo(40);
        jugador1.comprarCartones(5);
        jugador1.mostrarDatos();
        //Control de repeticion de numeros que salen del bombo
        ArrayList<Integer> bombo=new ArrayList<>();
        int numbombo=(int) (Math.random()*50)+1;
        do {
            if (bombo.contains(numbombo)){
                numbombo=(int)(Math.random()*50)+1;
            }else {
                System.out.println("Sale el numero: " + numbombo);
                bombo.add(numbombo);
                jugador1.comprobarNumeros(numbombo);
            }
        }while (jugador1.isGanador()!=true);
    }
}
