/**
 * 桥模式：将实现与抽象分离
 * 解决问题：不同的平台上对类的操作可能不一样，如果单纯的用继承，需要对每一个抽象的子类进行继承
 * 耦合性太高，对增加功能不够开放
 * 原理：使用桥模式，对实现部分使用Impl接口，将不同平台的操作和不同的抽象类衔接起来
 * 使用方法：通过调用抽象类中调用impl可以是从抽象工厂中获得一个平台的操作集
 * 然后对每个子抽象类再进行抽象
 */

package StructurePatterns.Bridge;

public class App {
    public static void main(String[] args) {
        Abstraction ap = new RedefinedAbstractionA();
        ap.Operation();
        ap.Operation();

        Abstraction bp = new RedefinedAbstractionB();
        bp.Operation();
        bp.Operation();
    }
}
