import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int reintento=0;
        do {
            int contgana = 0;
            int contpier = 0;
            for (int i = 0; i < 3; i++) {
                String humano = humano();
                String maquina = maquina();
                String ganador = resultado(humano, maquina);
                System.out.println("Tu elegiste: " + humano);
                System.out.println("La maquina eligio: " + maquina);
                System.out.println("El resultado es: " + ganador);
                if (ganador.equals("Ganas")) {
                    contgana++;
                } else if (ganador.equals("Pierdes")) {
                    contpier++;
                }
            }
            System.out.println("La maquina ha ganado: " + contpier + " partidas.");
            System.out.println("El jugador ha ganado: " + contgana + " partidas.");
            System.out.println("\n¿Quieres volver a jugar?\n1.Si\n2.No");
            reintento=scn.nextInt();

        }while (reintento==1);
        System.out.println("Fin del juego");
    }

    static String humano() {
        Scanner scn = new Scanner(System.in);
        int selechuman=0;
        String respuestaH="";
        do {
            System.out.println("Introduce tu seleccion:\n1.-Piedra\n2.-Papel\n3.-Tijera");
            selechuman = scn.nextInt();
        }
        while(selechuman!=1 && selechuman!=2 && selechuman!=3);

        switch (selechuman){
            case 1:
                respuestaH="Piedra";
                break;
            case 2:
                respuestaH="Papel";
                break;
            case 3:
                respuestaH="Tijera";
                break;
        }
        return respuestaH;
    }
    static String maquina(){
        int selecmaq = (int) (Math.random()*3)+1;
        String respuestaM="";
        switch (selecmaq){
            case 1:
                respuestaM="Piedra";
                break;
            case 2:
                respuestaM="Papel";
                break;
            case 3:
                respuestaM="Tijera";
                break;
        }

        return respuestaM;
    }
    static String resultado(String humano, String maquina){
        String respuestaM=maquina;
        String respuestaH=humano;
        String resultado="";
        if (respuestaM.equals("Piedra")&&respuestaH.equals("Papel")){
            resultado= "Ganas";
        } else if (respuestaM.equals("Piedra")  && respuestaH.equals("Tijera")) {
            resultado= "Pierdes";
        } else if (respuestaM.equals("Papel") && respuestaH.equals("Piedra")) {
            resultado="Pierdes";
        } else if (respuestaM.equals("Papel") && respuestaH.equals("Tijera")){
            resultado = "Ganas";
        } else if (respuestaM.equals("Tijera") && respuestaH.equals("Piedra")){
            resultado="Ganas";
        } else if (respuestaM.equals("Tijera") && respuestaH.equals("Papel")) {
            resultado="Pierdes";
        } else if (respuestaM.equals("Piedra") && respuestaH.equals("Piedra")) {
            resultado="Empate";
        }else if (respuestaM.equals("Papel") && respuestaH.equals("Papel")) {
            resultado="Empate";
        }else if (respuestaM.equals("Tijera") && respuestaH.equals("Tijera")) {
            resultado="Empate";
        }
        return resultado;
    }
}




