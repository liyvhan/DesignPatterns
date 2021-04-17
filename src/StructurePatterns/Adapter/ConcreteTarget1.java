package StructurePatterns.Adapter;

public class ConcreteTarget1 implements Target{
    @Override
    public void Request() {
        System.out.println("In the orignal target");
    }
}
