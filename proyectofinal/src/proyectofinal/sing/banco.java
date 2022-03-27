package proyectofinal.sing;

public class banco {
    String nombre;
    
    public banco(String nombre){
        this.nombre = nombre;
    }

    boolean pagar(double cantidad){
        System.out.println("El banco: " + nombre +" realizo el pago de: " + cantidad);
        return true;
    }
}
