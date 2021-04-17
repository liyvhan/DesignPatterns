package CreatePatterns.AbstractFactory;

public class ConcreteFactoryA implements  AbstractFactory{
    /**
     * 将工厂写为单例模式，只允许有一个工厂
     */
    private   ConcreteFactoryA(){};
    private  static  ConcreteFactoryA instance = new ConcreteFactoryA(); //懒汉式
    public static ConcreteFactoryA getInstance(){
        return  instance;
    }
    @Override
    public Product CreateProduct() {
        return new ConcreteProductA();
    }
}
