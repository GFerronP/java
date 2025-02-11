public class Main {
    public static void main(String[] args) {

        String[] circ = new String[20];
        sup(circ);
        inf(circ);
        System.out.println("Hello world!");
    }
    static void sup(String []circulo) {
        int cont = circulo.length / 2 - 1;
        for (int i = 0; i < circulo.length; i++) {
            circulo[i] = " ";
        }
        for (int i = circulo.length / 2; i > 0; i--) {
            cont++;
            circulo[i] = "*";
            circulo[cont] = "*";
            for (int j = 0; j < circulo.length; j++) {
                System.out.print(circulo[j]);
            }
            System.out.println();
        }
    }
    static void inf(String [] circulo) {
        int cont = circulo.length;
        for (int i = 1; i < circulo.length; i++) {
            circulo[i] = "*";
        }
        for (int i = 1; i < circulo.length / 2; i++) {
            cont--;
            circulo[i] = " ";
            circulo[cont] = " ";
            for (int j = 0; j < circulo.length; j++) {
                System.out.print(circulo[j]);
            }
            System.out.println();
        }
    }