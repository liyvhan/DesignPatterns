package StructurePatterns.Bridge;

public class ConcreteImplementorB implements Implementor{
    @Override
    public void OperationImp() {
        System.out.println("In platformB we use planB to operate");
    }
}
