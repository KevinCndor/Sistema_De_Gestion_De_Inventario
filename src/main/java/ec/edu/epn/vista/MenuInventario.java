package ec.edu.epn.vista;

import ec.edu.epn.controlador.Controlador;
import ec.edu.epn.logica.Producto;

import java.util.Scanner;

public class MenuInventario {
    MenuGeneral m = new MenuGeneral();
    Scanner entrada = new Scanner(System.in);
    String opcionesMenu = "";
    Controlador con = new Controlador();

    public void registrar(){
        System.out.println("***************REGISTRAR PRODUCTO***************");
        System.out.print("Código: ");
        String codigo = entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Precio: ");
        Double precio = Double.parseDouble(entrada.nextLine());
        System.out.print("Distribuidor: ");
        String distribuidor = entrada.nextLine();
        System.out.print("Unidades: ");
        int unidades = Integer.parseInt(entrada.nextLine());
        Producto producto = new Producto(codigo,nombre,precio,distribuidor,unidades);
        if(validarRegistro(producto)){
            System.out.println("Producto registrado con éxito");
            m.inventario();
        }
    }

    public boolean validarRegistro(Producto p) {
        if(!p.evitarDuplicados(p) && p.registrarProducto(p)){
            return true;
        }else{
            System.out.println("Error: El producto ya existe");
            m.inventario();
        }
        return false;
    }
}
