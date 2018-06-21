public class Sucursal {
    private int codSucursal;
    private String nombre;
    private double caja;
    private String ciudad;

    public Sucursal(int codSucursal, String nombre, double caja, String ciudad) {
        this.codSucursal = codSucursal;
        this.nombre = nombre;
        this.caja = caja;
        this.ciudad = ciudad;
    }

    public int getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(int codSucursal) {
        this.codSucursal = codSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return nombre +" Codigo de Sucursal = " + codSucursal + "nombre: " + nombre;
    }

    public String resumencaja(){
        return "El dinero en caja es el total de: " + caja;
    }

}
