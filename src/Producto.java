public class Producto {
    private int codProducto;
    private double valor;
    private String marca,tipo,nombre;
    private int cantidad=0;

    public Producto(int codProducto,String nombre, double valor, String marca, String tipo) {
        this.codProducto = codProducto;
        this.valor = valor;
        this.marca = marca;
        this.tipo = tipo;
        this.nombre = nombre;

    }

    public int id_contProducto(){
        cantidad=cantidad++;
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public void agregarProducto(){
    }

    @Override
    public String toString() {
        return "Codigo producto = " + codProducto +
                ", valor = " + valor +
                ", marca = " + marca +
                ", tipo = " + tipo+
                ", nombre = " + nombre;
    }

}
