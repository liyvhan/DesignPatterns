package StructurePatterns.Flyweight;

import StructurePatterns.Flyweight.flyweightPool.ConcreteFlyweight1;
import StructurePatterns.Flyweight.flyweightPool.ConcreteFlyweight2;
import StructurePatterns.Flyweight.flyweightPool.ConcreteFlyweight3;
import StructurePatterns.Flyweight.flyweightPool.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<Integer, Flyweight> flyWeights = new HashMap<Integer, Flyweight>();
    public   Flyweight getFlyweight(int key){
        if(flyWeights.get(key)==null){
            switch (key) {
                case 1:
                    flyWeights.put(key, new ConcreteFlyweight1());
                    break;
                case 2:
                    flyWeights.put(key, new ConcreteFlyweight2());
                    break;
                case 3:
                    flyWeights.put(key, new ConcreteFlyweight3());
                    break;
                default:
                    break;
            }
        }
        return (Flyweight) flyWeights.get(key);
    }

}
