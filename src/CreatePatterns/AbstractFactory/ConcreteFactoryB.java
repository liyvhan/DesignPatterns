package CreatePatterns.AbstractFactory;

public class ConcreteFactoryB implements AbstractFactory{
    /**
     * 将工厂写为单例模式，只允许有一个工厂
     */
    private   ConcreteFactoryB(){};
    private  static  ConcreteFactoryB instance = new ConcreteFactoryB(); //懒汉式
    public static ConcreteFactoryB getInstance(){
        return  instance;
    }
    @Override
    public Product CreateProduct() {
        return new ConcreteProductB();
    }
}
