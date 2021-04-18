package StructurePatterns.Decorator;

public class ConcreteCompoment implements Compoment{
    @Override
    public void draw() {
        System.out.println("Draw a compoment");
    }
}
