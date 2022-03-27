package proyectofinal;
import java.util.*;
import proyectofinal.iter.*;
public class iterat {

   public static String ProdList(ArrayList<Productos> prod){
    String list="";
    Iterator<Productos> it = prod.iterator();
    while(it.hasNext()){
        list+=it.next().toString();   
    }
    return list;
    }  
    
}
