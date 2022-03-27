package proyectofinal.sing;
import java.util.*;
public class almacen {
    String nombre;
    public List<cuentas> listaCuentas = new ArrayList<>();
    public List<cliente> listaClientes;

    public almacen(String nombre){
        this.nombre = nombre;
        listaClientes= new ArrayList<>();
    }
    @Override
    public String toString(){
        return "Almacen [nombre="+ nombre+"]";
    }
    
    
    public void setCuenta(cuentas cuenta){
    listaCuentas.add(cuenta);
    }
    
    public void setCliente(List<cliente> listaClientes){
    this.listaClientes = listaClientes;
    }

}
