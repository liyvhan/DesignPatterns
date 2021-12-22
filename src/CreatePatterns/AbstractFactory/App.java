/**
 * 抽象工厂模式
 * 支持创建多种组合的产品，降低耦合性
 * 对增加产品开放，只需要增加新类别的工厂就行不用大改代码
 */

package CreatePatterns.AbstractFactory;

public class App {
    public static void main(String[] args) {
        AbstractFactory a= ConcreteFactoryA.getInstance();
        AbstractFactory b= ConcreteFactoryB.getInstance();
        Product pa = a.CreateProduct();
        Product pb = b.CreateProduct();
        pa.options();
        pb.options();
    }
}
