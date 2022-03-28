package proyectofinal;
import proyectofinal.decor.*;

public abstract class Decorator implements Celular{
   private Celular cel;
   public Decorator(Celular cel){
       this.cel=cel;
   }
   protected Celular getCel(){
       return cel;
   }
}
