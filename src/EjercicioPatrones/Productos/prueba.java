package EjercicioPatrones.Productos;

import EjercicioPatrones.Agencia.Agencia;
import EjercicioPatrones.Clientes.Cliente;
import EjercicioPatrones.Descuentos.CantProductos;
import EjercicioPatrones.Ventas.ItemVenta;
import EjercicioPatrones.Ventas.Venta;

import java.util.ArrayList;
import java.util.Date;

public class prueba {


    public static void main(String[] args) {

        Date fecha = new Date();
        Agencia agencia = new Agencia();

        //Pasaje
        Pasaje pasaje1 = new Pasaje(1, "paquete1", 144, fecha, "compania1", "paris");
        Pasaje pasaje2 = new Pasaje(2, "paquete2", 14, fecha, "compania2", "paris");

        // alojamiento
        Alojamiento alojamiento1 = new Alojamiento(1, "Alojamiento1", 22, "Alojamientochido1");

        //agregar y remover a la lista
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(pasaje1);
        listaProductos.add(alojamiento1);
        listaProductos.add(pasaje2);

        Paquete paquete1 = new Paquete(1, "Paquete1", listaProductos);


        Cliente cliente1 = new Cliente(1, "Alexis", "4451215683", "ahernnan@everis.com");
        Cliente cliente2 = new Cliente(2, "Juan", "4454856938", "correo@everis.com");


        Venta venta = new Venta(1, cliente1);


        ItemVenta itemventa = new ItemVenta(1, "lool", pasaje1, venta);
        ItemVenta itemventa2 = new ItemVenta(1, "lool", paquete1, venta);
        ItemVenta itemventa3 = new ItemVenta(1, "lool", alojamiento1, venta);


        venta.confirmarVenta(cliente1, agencia);

        System.out.println(agencia.getClientes().size() + " Clientes clase prueba");

        itemventa.getSubtotal();
        //itemventa.getSubtotal();


        // System.out.println(agencia.getClientes().size());

    }
}




