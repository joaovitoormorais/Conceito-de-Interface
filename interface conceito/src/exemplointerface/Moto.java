package exemplointerface;

//exemplo do uso de classes concretas
public class Moto implements IAutomovel {

    @Override
    public void andar() {
        System.out.println("Com 2 rodas.");
    }
}
