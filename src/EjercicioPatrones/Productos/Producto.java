package EjercicioPatrones.Productos;

import java.util.ArrayList;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(int codigo, String descripcion, ArrayList<Producto> productos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio(productos);
    }

    private float precio(ArrayList<Producto> productos) {
        float precio = 0;
        for (Producto producto : productos) {
            precio += producto.getPrecio();
        }
        precio = calcularDescuento(precio);
        return precio;
    }

    private float calcularDescuento(float precio) {
        float descuento = (float) (precio * 0.05);
        return precio - descuento;
    }

}
