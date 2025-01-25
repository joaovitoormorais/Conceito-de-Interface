package exemplointerface;

//exemplo do uso de classes concretas
public class Carro implements IAutomovel {

    @Override
    public void andar() {
        System.out.println("com 4 rodas.");
    }
}
