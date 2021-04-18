package StructurePatterns.Composite;

public class Compoment {
    public void Operation(){};
    public void Add(Compoment chd){};
    void Remove(){};
    void GetChild(int chld){};
    void visitParent(){};//(Option)
}
