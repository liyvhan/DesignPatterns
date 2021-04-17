/**
 *类似生成器模式
 * 解决在构造时不知道应该使用哪一种子类的方法
 * 需要哪种就向工厂中拿
 * 将具体实现延迟到子类
 *
 * 解耦，尽量不去通过new访问类
 */
package CreatePatterns.FactoryMethod;
public class main {
    public static void main(String[] args) {
        main a;
        Creater mc= new ConcreteCreator();
        Product p = mc.FactoryMethod();
        p.show();
    }
}
