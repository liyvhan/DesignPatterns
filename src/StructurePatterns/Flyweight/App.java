/**
 * 目的：为了可以支持大量细粒度的对象（如字母字符不可能创建大量的字母对象，太浪费硬件资源）
 * 原理：创建flyweighty池（共享对象），通过flyweightFactory管理这些共享对象
 */
package StructurePatterns.Flyweight;

import StructurePatterns.Flyweight.flyweightPool.Flyweight;

public class App {
    public static void main(String[] args) {
        FlyweightFactory fa = new FlyweightFactory();
        Clienta a= new Clienta();
        ClietnB b= new ClietnB();

        a.action(fa.getFlyweight(1));
        b.action(fa.getFlyweight(2));
        b.action(fa.getFlyweight(1));
    }
}
