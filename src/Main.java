
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salida = "";

        //Creacion de objeto de clase SistemaVentas
        SistemaVentas sistema = new SistemaVentas();

        //Creacion de CasaMatriz
        CasaMatriz Pcfailtory = new CasaMatriz("Pcfailtory","76966888-k");


        //Creacion de Sucursal
        Sucursal Puerto_Montt = new Sucursal(65,"Puerto Montt",50000,"Puerto Montt");

        //Creacion de productos
        Producto Dell_alienware = new Producto(454,"Dell_alienware" ,1200, "Dell", "portable");
        sistema.contarProducto();
        Producto SSD_Kingston = new Producto(455,"SSD_Kingston", 25000, "Kingston", "almacenamiento");
        sistema.contarProducto();
        Producto Mem_RAM = new Producto(456, "Mem_RAM",3500, "Adata", "memorias volatiles");
        sistema.contarProducto();
        Producto Smart_TV = new Producto(459,"Smart_TV", 250000, "LG", "Tv");
        sistema.contarProducto();

        //Creacion de Vendedor
        Vendedor Gonzalo = new Vendedor("18735851-5","Gonzalo","Morales","966879621","Francisco Ottey #1534");

        //Creacion de Proveedor
        Proveedor Carlos_HP = new Proveedor("77412124-4","Carlos","Carlangas","977213234","Los Tenios #244","HP,DELL,IBM");
        Proveedor Pablo_Toshiba = new Proveedor("12.424.564-7","Pablo","Fuentes","966768754","Isla Teja #243","Toshiba");

        //Creacion de Cliente
        Cliente Carla = new Cliente("17414555-0","Carla","Carlangas","977558844","Costa Tenglo #414");

        //Creacion de Compra
        Compra Notebook = new Compra(10101,"23/08/2018","Compra",Carlos_HP, Dell_alienware, Puerto_Montt);

        //Creacion de Venta
        Venta compra_ram = new Venta(10102,"24/08/2018","Venta",Carla,Mem_RAM,Puerto_Montt);

        System.out.println("La empresa creada es " + Pcfailtory.toString());
        System.out.println("El producto es "+Dell_alienware.toString());
        System.out.println("La cantidad de productos es " + sistema.getConProducto());
        System.out.println("El vendedor creado es " + Gonzalo.toString());
        System.out.println("El proveedor creado es " + Carlos_HP.toString());
        System.out.println("El producto comprado es " + Notebook.toString());
        System.out.println("La compra efectuada es "+ compra_ram.toString());
        System.out.println(Puerto_Montt.resumencaja());
        System.out.println(crearProducto());
    }

    public static String crearProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el nomnbre del producto:");
        String nombre = sc.next();
        System.out.println("Muy bien el producto se llamará " + nombre);
        System.out.println("Por favor ingrese el codigo del producto: ");
        int cod = sc.nextInt();
        System.out.println("Muy bien el producto tendrá el código" + cod);
        System.out.println("Por favor ingrese el valor del producto: $");
        int precio= sc.nextInt();
        System.out.println("Muy bien el producto tendrá el precio" + precio);
        System.out.println("Por favor ingrese la marca del producto: ");
        String marca= sc.next();
        System.out.println("Muy bien el producto será de marca" + marca);
        System.out.println("Por favor ingrese el tipo de producto: ");
        String tipo= sc.next();
        System.out.println("Muy bien el producto será de tipo" + tipo);
        Producto prod = new Producto(cod,nombre,precio, marca, tipo);
        return prod.toString();
    }

}