package EjercicioPatrones.Ventas;

import EjercicioPatrones.Agencia.Agencia;
import EjercicioPatrones.Clientes.Cliente;
import EjercicioPatrones.Productos.Producto;

import java.util.ArrayList;

public class ItemVenta {

    private int cantidad;
    private String descripcion;
    private Producto producto;

    private int numeroVenta;
   // public Venta venta=new Venta();




    public ItemVenta(int cantidad, String descripcion, Producto producto, Venta v) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.producto = producto;
        for(int i=0; i<cantidad; i++){
            v.setItems(producto);
        }

    }

    public ItemVenta(){}

    public float getSubtotal(){



        return 0;
    }


    public boolean validarDestino(String destino){
        return ciudades().stream().anyMatch(c -> c.equalsIgnoreCase(destino));
    }

    public ArrayList<String> ciudades(){
        ArrayList<String> ciudades= new ArrayList<>();
        ciudades.add("Estambul");
        ciudades.add("Londres");
        ciudades.add("Roma");
        ciudades.add("Viena");
        ciudades.add("Paris");
        ciudades.add("Madrid");
        ciudades.add("Berlin");
        ciudades.add("Barcelona");
        ciudades.add("Munich");
        ciudades.add("Praga");
        ciudades.add("Milan");
        return ciudades;
    }



}
