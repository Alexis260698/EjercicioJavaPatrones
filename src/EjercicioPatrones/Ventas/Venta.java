package EjercicioPatrones.Ventas;

import EjercicioPatrones.Agencia.Agencia;
import EjercicioPatrones.Clientes.Cliente;
import EjercicioPatrones.Descuentos.ClienteFrecuente;
import EjercicioPatrones.Descuentos.Descuento;
import EjercicioPatrones.Productos.Pasaje;
import EjercicioPatrones.Productos.Producto;

import java.util.ArrayList;

    public class Venta {
    private int num;
    private ArrayList <Producto> items = new ArrayList<Producto>();
    private Cliente cliente;
    private float total;


    Agencia agencia =new Agencia();

    public float getTotal(ArrayList descuentos){
        return 0;
    }

    public boolean ValidarDestino(String destino){
        return true;
    }

    public void confirmarVenta(Cliente cliente, Agencia agencia){

        if(!existeCliente(cliente.getDni())){
            agencia.setCliente(getCliente());

        }


        float total=0;
        for(Producto producto :items) {
            total+=producto.getPrecio();
        }

        Venta ventaNueva= new Venta(num, items, this.cliente, total);
        ArrayList<Descuento> listaDescuentos= new ArrayList<Descuento>();

        if(descuentoPorCantCompras(cliente.getCantVentas())){
            //Si el cliente ha realizado más de 3 compras con la agencia, se le bonifica un 5%
            ClienteFrecuente descuentoCliente= new ClienteFrecuente();
            listaDescuentos.add(descuentoCliente);
        }

        if(descuentoPorProductos()){
            //Si la cantidad de los productos es mayor a 4, se le bonifica un 3%

        }

        if(descuentoPorPasajeYDestinoEuropeo()){
           // Si la venta incluye pasajes aéreos y el destino se encuentra en países europeos, se le bonifica el 5% de los pasajes.
            System.out.println("Aplica");
        }




        cliente.setVenta(ventaNueva);
        agencia.setVenta(ventaNueva);






        System.out.println(agencia.getClientes().size()+" Clientes clase Venta");
    }

    public boolean descuentoPorCantCompras(int cant){
        if(cant>3){
            return true;
        }else{
            return false;
        }

    }

    public boolean descuentoPorProductos(){
        if (items.size()>4){
            return true;
        }else{
            return false;
        }

    }

    public boolean descuentoPorPasajeYDestinoEuropeo() {
        ItemVenta itemVenta = new ItemVenta();
        Integer posicion =null;

        for(int i=0; i<items.size();i++){
            Producto p=getItems().get(i);
            String clase=p.getClass()+"";
            int a=clase.indexOf("Pasaje");
            if(a != - 1){
                posicion=i;
            }
        }

        if(posicion!=null){
            Pasaje pasaje= (Pasaje) getItems().get(posicion);

            return itemVenta.validarDestino(pasaje.getDestino());

        }else{
            return false;
        }

    }


    public boolean existeCliente(int cliente){
        return agencia.getClientes().stream().anyMatch(t -> t.getDni()==(cliente));
    }

    public Venta(int num, Cliente cliente){
        this.num = num;
        this.cliente = cliente;
    }

    public Venta(int num, ArrayList<Producto> items, Cliente cliente, float total) {
        this.num = num;
        this.items = items;
        this.cliente = cliente;
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setItems(ArrayList<Producto> items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getItems() {
        return items;
    }

    public void setItems(Producto producto) {
        items.add(producto);
    }


    public Venta(){}


}
