package proyectofinal.decor;
import proyectofinal.Decorator;

public class Ios extends Decorator{

      public Ios(Celular cel){
        super(cel);
    }
    
    @Override
    public void encender() {
        getCel().encender();
        System.out.println("Mostrando logo Apple");
    }

    @Override
    public void desbloquear() {
        getCel().desbloquear();
        System.out.println("Desbloqueando por huella");
    }

    @Override
    public void navegar() {
        getCel().navegar();
        System.out.println("Navegando por voz");
    }

    @Override
    public void apagar() {
       getCel().apagar();
        System.out.println("Mostrando logo Apple");
    }
    
}
