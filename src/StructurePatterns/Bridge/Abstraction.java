package StructurePatterns.Bridge;

import java.util.Scanner;

public abstract class Abstraction {
    protected Implementor getImpl(){
        int a;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        if(a==2) return  new ConcreteImplementorB();
        return new ConcreteImplementorA();
    };
    abstract void Operation();
}
