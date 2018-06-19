
public abstract class Transaccion {
    private int numTransaccion;
    private double valor;
    private String fecha;
    private String tipoTransaccion;
    private Producto producto;
    private Sucursal sucursal;

    public Transaccion(int numTransaccion, double valor, String fecha, String tipoTransaccion, Producto producto, Sucursal sucursal) {
        this.numTransaccion = numTransaccion;
        this.valor = valor;
        this.fecha = fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.producto = producto;
        this.sucursal = sucursal;
        modificarcaja();
    }

    public int getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(int numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public abstract double modificarcaja();

    @Override
    public String toString() {
        return "Transaccion{" +
                "numTransaccion=" + numTransaccion +
                ", valor=" + valor +
                ", fecha=" + fecha +
                ", tipoTransaccion='" + tipoTransaccion + '\'' +
                '}';
    }
}
