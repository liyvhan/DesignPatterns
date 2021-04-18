package StructurePatterns.Decorator;

public class ConcreteDirectorA extends Director{
    public ConcreteDirectorA(Compoment compoment) {
        super(compoment);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Add a directorA for compoment");
    }
}
