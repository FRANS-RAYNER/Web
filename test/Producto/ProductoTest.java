package Producto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {

    @Test
    public void calcularTotalTest() {
        Producto producto = new Producto("INV01", "Camiseta", 150, 2);
        double totalCalculado = producto.calcularTotal();
        double totalEsperado = 300;
        assertEquals(totalEsperado, totalCalculado, 0);
    }

    @Test
    public void calcularDescuentoTest() {
        Producto producto1 = new Producto("INV01", "Camiseta", 150, 2);
        Producto producto2 = new Producto("INV02", "Zapatillas", 250, 3);

        String descuentoCalculado1 = producto1.calcularDescuento();
        String descuentoEsperado1 = "-20%";
        assertEquals(descuentoEsperado1, descuentoCalculado1);

        String descuentoCalculado2 = producto2.calcularDescuento();
        String descuentoEsperado2 = "-10%";
        assertEquals(descuentoEsperado2, descuentoCalculado2);
    }
}
