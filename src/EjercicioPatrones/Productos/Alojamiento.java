package EjercicioPatrones.Productos;

public class Alojamiento extends Producto{
    private String nombreAlojamiento;

    public  Alojamiento(int codigo, String descripcion, float precio, String nombreAlojamiento){
        super(codigo,descripcion,precio);
        this.nombreAlojamiento=nombreAlojamiento;
    }

}
