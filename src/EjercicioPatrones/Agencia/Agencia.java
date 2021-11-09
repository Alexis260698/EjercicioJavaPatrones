package EjercicioPatrones.Agencia;

import EjercicioPatrones.Clientes.Cliente;
import EjercicioPatrones.Descuentos.Descuento;
import EjercicioPatrones.Productos.Alojamiento;
import EjercicioPatrones.Productos.Pasaje;
import EjercicioPatrones.Ventas.Venta;

import java.util.ArrayList;

public class Agencia {
    private ArrayList <Cliente> clientes= new ArrayList<Cliente>();
    private ArrayList <Pasaje>pasajes= new ArrayList<Pasaje>();
    private ArrayList <Alojamiento>alojamientos= new ArrayList<Alojamiento>();
    private ArrayList <Venta>ventas = new ArrayList<Venta>();;
    private ArrayList <Descuento>descuentos= new ArrayList<Descuento>();

    private static Agencia instancia;

    public static Agencia getInstancia(){
        if(instancia==null){
            instancia=new Agencia();
        }
        return instancia;
    }

    public int getCantVentas(int codigo){
        return 0;
    }

    public int getCantidadVentasCliente(int dni){
        return 0;
    }


    public void setCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void setVenta(Venta venta){
        ventas.add(venta);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Agencia(){
        clientes= new ArrayList<Cliente>();
    }

    public Venta Venta(int numero){ return ventas.stream().filter(p-> p.getNum()==numero).findFirst().get();}

}
