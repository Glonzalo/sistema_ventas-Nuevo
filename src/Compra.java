public class Compra extends Transaccion {
    private Proveedor proveedor;


    public Compra(int numTransaccion, double valor, String fecha, String tipoTransaccion, Proveedor proveedor, Producto producto, Sucursal sucursal) {
        super(numTransaccion, valor, fecha, tipoTransaccion,producto, sucursal);
        this.proveedor = proveedor;
        modificarcaja();
    }


    @Override
    public String toString() {
        return  getProducto().getNombre()+
                ", numero transaccion = " + getNumTransaccion() +
                ", valor = " + getValor() +
                ", fecha = " + getFecha()+
                ", proveedor = " + proveedor.getNombre()+" "+ proveedor.getApellido()+
                ", representante de la marca = " + proveedor.getDescripcion();
    }

    @Override
    public double modificarcaja() {
       double total = getSucursal().getCaja() + getValor();
       getSucursal().setCaja(total);
       return  total;
    }

}
