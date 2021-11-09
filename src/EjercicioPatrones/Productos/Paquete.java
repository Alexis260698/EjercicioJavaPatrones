package EjercicioPatrones.Productos;

import java.util.ArrayList;

public class Paquete extends Producto {

    private ArrayList<Producto> productos = new ArrayList();
    private float descuento;

    public Paquete(int codigo, String descripcion, ArrayList<Producto> productos) {
        //paquete1.getProductos().forEach(p -> System.out.println(p.getPrecio()));
        super(codigo, descripcion, productos);

    }


    public ArrayList add(Producto p) {
        productos.add(p);
        return productos;
    }

    public boolean remove(Producto p) {
        productos.remove(p);
        return true;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
