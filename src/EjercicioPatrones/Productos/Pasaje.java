package EjercicioPatrones.Productos;

import java.util.Date;

public class Pasaje extends Producto{
    private Date fecha;
    private String compañia;
    private String destino;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public  Pasaje(int codigo, String descripcion, float precio, Date fecha, String compañia, String destino){
    super(codigo,descripcion,precio);
    this.fecha=fecha;
    this.compañia=compañia;
    this.destino=destino;
    }

}

