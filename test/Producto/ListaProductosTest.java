package Producto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaProductosTest {

    @Test
    public void calcularMontoTotalTest() {
        ListaProductos listaProductos = new ListaProductos();
        listaProductos.agregarProducto(new Producto("INV01", "Camiseta", 150, 2));
        listaProductos.agregarProducto(new Producto("INV02", "Zapatillas", 250, 3));

        double montoTotalCalculado = listaProductos.calcularMontoTotal();
        double montoTotalEsperado = 1000;
        assertEquals(montoTotalEsperado, montoTotalCalculado, 0);
    }
}
