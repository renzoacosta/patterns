package proyectofinal;
import proyectofinal.strat.*;
public class Strategy {
 
    public Strategy(Integer opt, Integer x,Integer y){
       switch(opt){
        case 1: 
                Suma sum = new Suma(x,y);
        break;
        case 2:
                Resta res = new Resta(x,y);
        break;
        case 3:
            Multiplicacion mult = new Multiplicacion(x,y);
        break;
        case 4:
            Division div = new Division(x,y);
        break;
        default:
               System.out.println("Opcion inexistente");
        break;
        }
    }    
}
