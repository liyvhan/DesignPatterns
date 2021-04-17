package StructurePatterns.Adapter;

public class Adapter extends Adaptee implements Target{
    @Override
    public void Request() {
        specialRequest();
    }
}
