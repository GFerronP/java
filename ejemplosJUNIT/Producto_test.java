package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Producto_test {

    @Test
    public void testCalcularTotal() {
        Producto producto = new Producto("Producto1", 10.0, 2);
        assertEquals(20.0, producto.calcularTotal(), 0.01); // Utilizamos delta para tolerar pequeñas diferencias debido a errores de redondeo
    }

    @Test
    public void testModificarCantidad() {
        Producto producto = new Producto("Producto2", 5.0, 3);
        producto.setCantidad(5);
        assertEquals(25.0, producto.calcularTotal(), 0.01); // Utilizamos delta para tolerar pequeñas diferencias debido a errores de redondeo
    }

    @Test
    public void testModificarPrecio() {
        Producto producto = new Producto("Producto3", 8.0, 4);
        producto.setPrecio(10.0);
        assertEquals(40.0, producto.calcularTotal(), 0.01); // Utilizamos delta para tolerar pequeñas diferencias debido a errores de redondeo
    }
}

