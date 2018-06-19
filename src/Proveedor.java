public class Proveedor extends Persona {
        private String descripcion;
    public Proveedor(String rut, String nombre, String apellido, String telefono, String direccion,String descripcion) {
        super(rut, nombre, apellido, telefono, direccion);
    this.descripcion = descripcion;
        }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
