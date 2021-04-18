package StructurePatterns.Decorator;

public class ConcreteDirectorB extends Director{
    public ConcreteDirectorB(Compoment compoment) {
        super(compoment);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Add a directorB for compoment");
    }
}
