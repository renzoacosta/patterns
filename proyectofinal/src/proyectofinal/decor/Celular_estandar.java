package proyectofinal.decor;

public class Celular_estandar implements Celular  {
    
    private String marca;
    public Celular_estandar(String marca) {
        this.marca = marca;
    }
    
    @Override
    public void encender() {
         System.out.println("Encendiendo");
    }

    @Override
    public void desbloquear() {
        System.out.println("Desbloqueando");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando");
    }
}
