/**
 * 装饰器模式
 * 结构类似于组合模式，但相似点仅止于递归
 * Compoment声明抽象接口
 * 装饰器类中存在一个抽象Compoment是递归进入子类的装饰器，通过构造函数，或结合builder模式使用
 * 调用draw函数时，先递归下一个装饰器到最后文本，层层装饰
 */
package StructurePatterns.Decorator;

public class App {
    public static void main(String[] args) {
        Compoment com = new ConcreteCompoment();
        Compoment dirA = new ConcreteDirectorA(com);
        Compoment dirB = new ConcreteDirectorB(dirA);
        dirB.draw();
    }
}
