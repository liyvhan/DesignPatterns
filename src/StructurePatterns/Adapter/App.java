/**
 * 适配器模式
 * 一个已经存在的类的接口不符合需求，不能对每一个都进行子类化
 *
 * 新建一个适配器类去将这个类的接口规范话，在适配器中调用该类将接口统一化
 */
package StructurePatterns.Adapter;

public class App {
    public static void main(String[] args) {
        Target ot = new ConcreteTarget1();
        Target ad = new Adapter();
        ot.Request();
        ad.Request();
    }
}