package EjercicioPatrones.Descuentos;

import EjercicioPatrones.Ventas.Venta;

public class DestinoEuropeo implements Descuento{

    private float porcentaje;

    @Override
    public float getDescuento(Venta v) {
        return 0;
    }


}
