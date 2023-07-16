package Producto;



public class Producto {
    private String codigo;
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto(String codigo, String nombre, int precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public String calcularDescuento() {
        if (calcularTotal() < 180) {
            return "-20%";
        } else {
            return "-10%";
        }
    }

    // Getters y setters (omitiendo para simplicidad)
}
