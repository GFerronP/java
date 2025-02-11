package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        double[] temperaturas = {10.5, 12.0, 15.2, 18.4, 22.5, 25.7, 27.8, 27.0, 24.3, 20.1, 15.4, 11.2};
        double[] probabilidadesLluvia = {0.2, 0.15, 0.25, 0.3, 0.2, 0.1, 0.05, 0.07, 0.15, 0.25, 0.3, 0.4};

        int mesMasLluvioso = encontrarMesMasLluvioso(probabilidadesLluvia);
        double temperaturaMedia = calcularTemperaturaMedia(temperaturas);


        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String nombreMesMasLluvioso = nombresMeses[mesMasLluvioso];


        System.out.println("Mes más lluvioso: " + nombreMesMasLluvioso);
        System.out.println("Temperatura media anual: " + temperaturaMedia + "°C");
    }

    public static int encontrarMesMasLluvioso(double[] probabilidadesLluvia) {
        int indiceMaximo = 0;
        for (int i = 1; i < probabilidadesLluvia.length; i++) {
            if (probabilidadesLluvia[i] > probabilidadesLluvia[indiceMaximo]) {
                indiceMaximo = i;
            }
        }
        return indiceMaximo;
    }

    public static double calcularTemperaturaMedia(double[] temperaturas) {
        double suma = 0;
        double media;
        for (int i = 0;i<temperaturas.length;i++) {
            suma += temperaturas[i];
        }
        media = suma / temperaturas.length;

        return media;
    }
}
