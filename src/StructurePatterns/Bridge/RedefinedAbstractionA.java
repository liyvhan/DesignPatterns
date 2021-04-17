package StructurePatterns.Bridge;

public class RedefinedAbstractionA extends Abstraction{
    @Override
    public void Operation() {
            System.out.println("to operate a 1 product");
            Implementor imp = this.getImpl();
            imp.OperationImp();
    }
}
