package StructurePatterns.Bridge;

public class ConcreteImplementorA implements Implementor{
    @Override
    public void OperationImp() {
        System.out.println("In platformA we use planA to operate");
    }
}
