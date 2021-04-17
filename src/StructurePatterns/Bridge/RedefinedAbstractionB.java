package StructurePatterns.Bridge;

public class RedefinedAbstractionB extends Abstraction{
    @Override
    public void Operation() {
        System.out.println("to operate a 2 product");
        Implementor imp = this.getImpl();
        imp.OperationImp();
        imp.OperationImp();
    }
}
