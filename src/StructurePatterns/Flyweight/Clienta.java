package StructurePatterns.Flyweight;

import StructurePatterns.Flyweight.flyweightPool.Flyweight;

public class Clienta {
    void action(Flyweight fly){
        fly.action();
        System.out.println(fly.hashCode());
    }
}
