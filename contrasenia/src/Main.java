import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que
        introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
        mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque
        le queden intentos).*/
        Scanner scn=new Scanner(System.in);
        String contrasenia="premio";
        String password;

        final int intentos=3;

        boolean acierto=false;

        for (int i=0;i<intentos && !acierto;i++){
            System.out.println("Introduce la contraseña");
            password=scn.nextLine();
            if (password.equals(contrasenia)) {
                    System.out.println("Correcto");
                    acierto=true;

            } else {
                System.out.println("Vuelve a intentarlo");
            }
        }
        }
    }
