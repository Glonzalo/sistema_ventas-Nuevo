
public class Venta extends Transaccion{

    public Venta(int numTransaccion, double valor, String fecha, String tipoTransaccion, Producto producto, Sucursal sucursal) {
        super(numTransaccion, valor, fecha, tipoTransaccion, producto, sucursal);
    }
    @Override
    public double modificarcaja() {
        double total = getSucursal().getCaja() + getValor();
        return  total;

    }
}
