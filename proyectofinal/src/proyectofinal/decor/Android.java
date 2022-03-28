package proyectofinal.decor;
import proyectofinal.Decorator;

public class Android extends Decorator{
   
    public Android(Celular cel){
        super(cel);
    }
    
    @Override
    public void encender() {
       getCel().encender();
        System.out.println("Mostrando logo Android");
    }

    @Override
    public void desbloquear() {
        getCel().desbloquear();
        System.out.println("Desbloqueando por patron");
    }

    @Override
    public void navegar() {
        getCel().navegar();
    }

    @Override
    public void apagar() {
     getCel().apagar();
        System.out.println("Mostrando logo Android");
    }
}
