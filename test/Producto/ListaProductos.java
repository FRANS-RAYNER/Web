package Producto;



import java.util.ArrayList;
import java.util.List;

public class ListaProductos {
    private List<Producto> productos;

    public ListaProductos() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularMontoTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    // Getters y setters (omitiendo para simplicidad)
}
