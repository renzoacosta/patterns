package proyectofinal.sing;

public class cuentas {
    String clave;
    public cuentas(String clave){
        this.clave = clave;                
    }
    @Override
    public String toString(){
        return "Cuenta [clave="+ clave+"]";
    }
    
}
