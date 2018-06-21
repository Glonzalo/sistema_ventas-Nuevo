
public class Venta extends Transaccion{
    private Cliente cliente;

    public Venta(int numTransaccion,String fecha, String tipoTransaccion,Cliente cliente, Producto producto, Sucursal sucursal) {
        super(numTransaccion, fecha, tipoTransaccion, producto, sucursal);
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return  getProducto().getNombre()+
                ", numero transaccion = " + getNumTransaccion() +
                ", valor = " + getProducto().getValor() +
                ", fecha = " + getFecha()+
                " y el cliente es = " + cliente.getNombre()+" "+ cliente.getApellido();
    }


    @Override
    public double modificarcaja() {
        double total = getSucursal().getCaja() + getProducto().getValor();
        getSucursal().setCaja(total);
        return getProducto().getValor();
    }


}
