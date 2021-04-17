package CreatePatterns.FactoryMethod;

public class ConcreteProduct implements Product{

    @Override
    public void show() {
        System.out.println("This is a create product");
    }
}
