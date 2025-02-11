package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadora_test {

    @Test
    public void sumar_test() {
        Calculadora miCalcu= new Calculadora();
        assertEquals(miCalcu.sumar(1,1),2);
    }
    @Test
    public void restar_test() {
        Calculadora miCalcu= new Calculadora();
        assertEquals(miCalcu.restar(3,1),2);
    }
    @Test
    public void calcularTotal_test() {
        CestaDeLaCompra miCesta=new CestaDeLaCompra();
        miCesta.agregarProducto(new Producto("p1",2,40));
        miCesta.agregarProducto(new Producto("p2",5,40));

        assertEquals(miCesta.calcularTotal(),280);
    }


/*
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
*/

}
