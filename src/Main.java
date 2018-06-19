
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
        System.out.println("La sucursal creada es "+ Puerto_Montt.toString());
        //Creacion de productos
        Producto Dell_alienware = new Producto(454,"Dell_alienware" ,1200, "Dell", "portable");
        sistema.contarProducto();
        Producto SSD_Kingston = new Producto(455,"SSD_Kingston", 25000, "Kingston", "almacenamiento");
        sistema.contarProducto();
        Producto Mem_RAM = new Producto(456, "Mem_RAM",20000, "Adata", "memorias volatiles");
        sistema.contarProducto();
        Producto Smart_TV = new Producto(459,"Smart_TV", 250000, "LG", "Tv");
        sistema.contarProducto();

        //Creacion de Vendedor
        Vendedor Gonzalo = new Vendedor("18735851-5","Gonzalo","Morales","966879621","Francisco Ottey #1534");

        //Creacion de Proveedor
        Proveedor Carlos_HP = new Proveedor("77412124-4","Carlos","Carlangas","977213234","Los Tenios #244","HP,DELL,IBM");

        //Creacion de Cliente
        Cliente Carla = new Cliente("17414555-0","Carla","Carlangas","977558844","Costa Tenglo #414");

        //Creacion de Compra
        Compra Notebook = new Compra(10101,"23/08/2018","Compra",Carlos_HP, Dell_alienware, Puerto_Montt);

        System.out.println("La empresa creada es " + Pcfailtory.toString());
        System.out.println("El producto es "+Dell_alienware.toString());
        System.out.println("La cantidad de productos es " + sistema.getConProducto());
        System.out.println("El vendedor creado es " + Gonzalo.toString());
        System.out.println("El proveedor creado es " + Carlos_HP.toString());
        System.out.println("El producto comprado es " + Notebook.toString());
        System.out.println("La sucursal creada es "+ Puerto_Montt.toString());



    }
}