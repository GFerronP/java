package org.example;

public class Sumatorio extends Thread {
    private int numero;
    private int[] resultado;
    private int indice;

    public Sumatorio(int numero, int[] resultado, int indice) {
        this.numero = numero;
        this.resultado = resultado;
        this.indice = indice;
    }

    @Override
    public void run() {
        int suma = 0;
        for (int i = 1; i <= numero; i += 2) {
            suma += i;
        }
        resultado[indice] = suma; //Guarda el resultado en el array compartido
    }
}
