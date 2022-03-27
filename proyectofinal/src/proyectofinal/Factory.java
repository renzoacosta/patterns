package proyectofinal;
import proyectofinal.fact.*;

public class Factory {
    public static  Envio CrearEnvio(Integer pago){
        Envio envio = null;
        if ( pago >= 100 && pago <= 250){
            envio = new envioNormal();
        }else if ( pago >= 250 && pago< 500){
            envio = new envioExpress();
        }
        else if ( pago >= 500){
            envio = new envioGratis();
        }
        return envio;
    }
}
