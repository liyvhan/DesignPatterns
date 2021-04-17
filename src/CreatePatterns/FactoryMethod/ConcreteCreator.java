package CreatePatterns.FactoryMethod;

public class ConcreteCreator implements Creater{
    @Override
    public Product FactoryMethod() {
        return new ConcreteProduct();
    }
}
