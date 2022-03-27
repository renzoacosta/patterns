package proyectofinal.sing;

public class cliente {
 String nombre;
 public banco banco;
       public cliente( String nombre){
           this.nombre= nombre;
       }  
       @Override
       public String toString(){
           return "Cliente [nombre="+ nombre+"]";
       }
       
       public void realizarPago(double cantidad){
           boolean resultado = banco.pagar(cantidad);
       }
}
