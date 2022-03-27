package proyectofinal;
import proyectofinal.fact.*;
import java.util.*;

public class Proyectofinal {
 /*
    composicion > cuentas no puede existir sin almacen
    agregacopm > clientes puede existir sin almacen
    delegacion > clientes sede una actividad a banco
 */ 
    public static void main(String[] args) {
        //eleccion de patron a utilizar-----------------------------------------
        System.out.println("-----------------Elige una opciones------------");
        System.out.println("1:Singleton");
        System.out.println("2:Factory");
        System.out.println("3:Flyweight");
        System.out.println("4:Proxy");
        System.out.println("5:Chain of Responsibility");
        
        Scanner scan = new Scanner(System.in);        
        int opt = scan.nextInt();
        
      //-----------------------limpiar pantalla---------------------------------
        for (int i = 0; i < 20; ++i) System.out.println();
      //------------------------------------------------------------------------
      switch(opt){
            case 1: 
                //ejecucion de singleton----------------------------------------  
                /*
                banco apertura de varias cuentas con un costo de 100 cada una
                se recibe la ubicacion del banco, la lista de cuentas,
                el nombre del asesor, el nombre del banco y el pago.
                se devuelve si las cuentas fueron activadas si el pago fue
                correcto, de lo contrario da error de pago.
                */
                singleton sing = singleton.getInstance();
                List<String> cuentas = new ArrayList<String>();
                cuentas.add("001");
                cuentas.add("002");
                sing.registrar("centro",cuentas,"Ramon","Santander",200);
                break;
                //--------------------------------------------------------------
            case 2: 
                /* paqueteria realiza envio de un producto dependiendo del coste
                del mismo, se recibe el pago y el nombre del producto, dependiendo
                del mismo puede ser envio normal, express o gratis.
                */
                Orden orden = new Orden();
                orden.RelizarOrden(500,"muñeca");
                break;
            case 3: 
                System.out.println("3");
                break;
            case 4: 
                System.out.println("4");
                break;
            case 5: 
                System.out.println("5");
                break;
            default: System.out.println("no se eligio un patron valida"); 
            break;
    }
        
    }
    
}
