//Banco
package proyectofinal.fact;
import proyectofinal.*;

public class Orden {
    
    public Envio RelizarOrden(Integer pago, String prod){
        Envio envio = Factory.CrearEnvio(pago);
                envio.getName(prod);
                envio.Empaquetar();
                envio.Sellar();
                envio.Enviar();
                envio.Finalizar();
	return envio;    
    }
	
}
