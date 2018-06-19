
public class Venta extends Transaccion{

    public Venta(int numTransaccion,String fecha, String tipoTransaccion, Producto producto, Sucursal sucursal) {
        super(numTransaccion, fecha, tipoTransaccion, producto, sucursal);
    }
    @Override
    public double modificarcaja() {
        double total = getSucursal().getCaja() + getProducto().getValor();
        return  total;

    }
}
