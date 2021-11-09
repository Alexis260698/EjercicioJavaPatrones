package EjercicioPatrones.Descuentos;

import EjercicioPatrones.Ventas.Venta;

public interface Descuento {
    float porcentaje = 0;

     float getDescuento(Venta v);
}
