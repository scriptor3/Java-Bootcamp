package dia9.ejercicio2;

public class producto {
    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCoste;
    private double precioVenta;
    private int cantidadEnStock;

    public producto() {
    }

    public producto(int codigo, String nombre, String marca, String tipo, double precioCoste, double precioVenta, int cantidadEnStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCoste = precioCoste;
        this.precioVenta = precioVenta;
        this.cantidadEnStock = cantidadEnStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCoste() {
        return precioCoste;
    }

    public void setPrecioCoste(double precioCoste) {
        this.precioCoste = precioCoste;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
}
