package proyectofinal.decor;
import proyectofinal.Decorator;

public class Windows extends Decorator{
    
    public Windows(Celular cel){
        super(cel);
    }
    
    @Override
    public void encender() {
        getCel().encender();
        System.out.println("Mostrando logo Windows");
    }

    @Override
    public void desbloquear() {
        getCel().desbloquear();
        System.out.println("Desbloqueando por reconocimiento facial");
    }

    @Override
    public void navegar() {
         getCel().navegar();
    }

    @Override
    public void apagar() {
            getCel().apagar();
        System.out.println("Mostrando logo Windows");
    }
}
