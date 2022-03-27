package proyectofinal.fact;

abstract public class Envio {
    String producto;
    String T_aprox;
    String Paqueteria;
    public String getName(String producto){
        this.producto = producto;
        return producto;
    }
   
    public void Empaquetar() {
	System.out.println("Empaquetando " + producto);
    }
    public void Sellar() {
	System.out.println("Sellando " + producto);
    }
    public void Enviar() {
	System.out.println("Enviando " + producto);
    }
    public void Finalizar() {
        System.out.println("----------------tiquiet--------------");
        System.out.println("Producto " + producto);
        System.out.println("Tiempo aproximado: "+T_aprox);
	System.out.println("Paqueteria: "+Paqueteria);
    }
    
}
