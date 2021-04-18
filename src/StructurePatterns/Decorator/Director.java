package StructurePatterns.Decorator;

import java.util.ArrayList;

public class Director implements Compoment{
     private Compoment compoment;
     public Director(Compoment compoment){
         this.compoment = compoment;
     };

    @Override
    public void draw() {
        compoment.draw();
    }


}
