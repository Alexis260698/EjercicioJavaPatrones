package EjercicioPatrones.Clientes;


import EjercicioPatrones.Ventas.Venta;

import java.util.ArrayList;

public class Cliente {

    private int dni;
    private String nombre;
    private String telefono;
    private String mail;
    private ArrayList<Venta> ventas= new ArrayList<Venta>();

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setVenta(Venta venta) {
        ventas.add(venta);
    }

    public Cliente(int dni, String nombre, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }


    public int getCantVentas(){
        return ventas.size();
    }

}
