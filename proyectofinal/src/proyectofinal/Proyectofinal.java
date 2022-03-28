package proyectofinal;
import proyectofinal.fact.*;
import proyectofinal.iter.*;
import java.util.*;
import proyectofinal.decor.*;

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
        System.out.println("3:Strategy");
        System.out.println("4:Iterator");
        System.out.println("5:Decorator");
        
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
                /*
                Calculadora basica dependiente de 3 entrada realiza una operacion 
                entre suma, resta, multiplicacion y division, aplicando una estrategia
                distinta con las mismas entradas. 
                */
                Strategy st = new Strategy(3,4,2);
               break;
            case 4: 
                /*
                Control de almacenamiento para añadir y consultar un listado de 
                productos, añadiendo productos por id y por nombre, y consultadolos
                por el metodo de iteracion.
                */
                ArrayList<Productos> prod = new ArrayList<>();
                prod.add(new Productos("001","Arroz"));
                prod.add(new Productos("002","Frijol"));
                prod.add(new Productos("003","Huevo 12 pz"));
                
                iterat it = new iterat();
                
                System.out.println(it.ProdList(prod));
                break;
            case 5: 
                /*
                Simulacion de la verificacion de un celular, en donde existen 3
                variantes de sistemas operativos, windows, ios y android, donde
                dependiendo del sistema operativo puede actuar el dispositivo de
                una forma u otra
                */
                Celular celular = new Celular_estandar("Alcatel");
                celular = new Android(celular);
                celular.encender();
                celular.desbloquear();
                celular.navegar();
                celular.apagar();
                 
                break;
            default: System.out.println("no se eligio un patron valida"); 
            break;
    }
        
    }
    
}
