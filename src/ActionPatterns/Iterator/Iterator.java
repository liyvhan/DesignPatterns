package ActionPatterns.Iterator;

import java.util.ArrayList;

public class Iterator {
    private  int idx;

    public int get() {
        return cons.get(idx);
    }

    private ArrayList<Integer> cons;
    public Iterator(int idx,ArrayList<Integer> cons){
        this.cons = cons;
        this.idx = idx;
    }
    public  Iterator next(){
        return  new Iterator(idx+1,cons);
    };
}
