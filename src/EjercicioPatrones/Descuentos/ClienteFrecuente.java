package EjercicioPatrones.Descuentos;

import EjercicioPatrones.Ventas.Venta;

public class ClienteFrecuente implements Descuento{

    private float porcentaje=(float)0.05;

    @Override
    public float getDescuento(Venta v) {

        return 0;
    }
}
