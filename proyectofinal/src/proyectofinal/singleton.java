package proyectofinal;
import proyectofinal.sing.*;
import java.util.*;

public class singleton {
    private singleton(){
        
    }
    
    private static singleton instance;
    
    static singleton getInstance(){
        if(instance==null){
            instance = new singleton();
        }
        return instance;
    }
    public void registrar(String alm,List<String> cue,String cli,String ban,double pag){
        almacen almacen1 = new almacen(alm);
        for(int i=0;i<cue.size(); i++){
            almacen1.setCuenta(new cuentas(cue.get(i)));
        }
             
        cliente c1 = new cliente(cli);
        c1.banco = new banco(ban);
        if( pag >= (cue.size()*100) ){
           c1.realizarPago(pag); 
        List<cliente> listaClientes = new ArrayList<>();
        listaClientes.add(c1);
        
        almacen1.setCliente(listaClientes);
        
        System.out.println("Cuentas activada: "+ almacen1.listaCuentas +"Nombre de asesor: " + almacen1.listaClientes);
        
        }else if( pag< (cue.size()*100) ){
            System.out.println("error en pago");
            almacen1 = null;
        }
    }
}
