package StructurePatterns.Composite;

import java.util.ArrayList;

public class Composite extends Compoment{
    ArrayList <Compoment> children = new ArrayList<Compoment>();
    @Override
    public void Add(Compoment chd) {
        children.add(chd);
        super.Add(chd);
    }

    @Override
    void Remove() {
        super.Remove();
    }

    @Override
    void GetChild(int chld) {
        super.GetChild(chld);
    }

    @Override
    public void Operation() {
        super.Operation();
        for(Compoment g : children){
            g.Operation();
        }
    }
}
