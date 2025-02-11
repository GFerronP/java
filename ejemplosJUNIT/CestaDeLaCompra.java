package org.example;

import java.util.ArrayList;
import java.util.List;

public class CestaDeLaCompra {
    private List<Producto> productos;

    public CestaDeLaCompra() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

