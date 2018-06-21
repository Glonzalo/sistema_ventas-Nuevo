public class Compra extends Transaccion {
    private Proveedor proveedor;


    public Compra(int numTransaccion , String fecha, String tipoTransaccion, Proveedor proveedor, Producto producto, Sucursal sucursal) {
        super(numTransaccion, fecha, tipoTransaccion,producto, sucursal);
        this.proveedor = proveedor;
    }


    @Override
    public String toString() {
        return  getProducto().getNombre()+
                ", numero transaccion = " + getNumTransaccion() +
                ", valor = " + getProducto().getValor() +
                ", fecha = " + getFecha()+
                ", proveedor = " + proveedor.getNombre()+" "+ proveedor.getApellido()+
                ", representante de la marca = " + proveedor.getDescripcion();
    }

    @Override
    public double modificarcaja() {
       double total = getSucursal().getCaja() - getProducto().getValor();
       getSucursal().setCaja(total);
       return getProducto().getValor();
    }
}
