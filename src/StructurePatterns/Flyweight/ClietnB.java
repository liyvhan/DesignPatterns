package StructurePatterns.Flyweight;

import StructurePatterns.Flyweight.flyweightPool.ConcreteFlyweight1;
import StructurePatterns.Flyweight.flyweightPool.Flyweight;

public class ClietnB {
    void action(Flyweight fly){
        fly.action();
        System.out.println(fly.hashCode());
    }
}
