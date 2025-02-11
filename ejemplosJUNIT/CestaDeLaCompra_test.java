package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CestaDeLaCompra_test {

    @Test
    public void testAgregarYEliminarProducto() {
        CestaDeLaCompra cesta = new CestaDeLaCompra();
        Producto producto1 = new Producto("Producto1", 10.0, 2);
        Producto producto2 = new Producto("Producto2", 5.0, 3);

        cesta.agregarProducto(producto1);
        cesta.agregarProducto(producto2);

        assertEquals(2, cesta.getProductos().size());

        cesta.eliminarProducto(producto1);

        assertEquals(1, cesta.getProductos().size());
        assertFalse(cesta.getProductos().contains(producto1));
    }

    @Test
    public void testCalcularTotal() {
        CestaDeLaCompra cesta = new CestaDeLaCompra();
        Producto producto1 = new Producto("Producto1", 10, 2);
        Producto producto2 = new Producto("Producto2", 5, 3);

        cesta.agregarProducto(producto1);
        cesta.agregarProducto(producto2);

        assertEquals(35, cesta.calcularTotal());
    }

}
