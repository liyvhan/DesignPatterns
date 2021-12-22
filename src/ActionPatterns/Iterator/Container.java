package ActionPatterns.Iterator;

import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> cnt;
    public Container(ArrayList<Integer> cnt){
        this.cnt = cnt;
    }
    public Iterator CreateIterator(int i ){
        return new Iterator(i,cnt);
    }

    public Iterator first(){
        return  new Iterator(0,cnt);
    }

    public  Iterator end(){
        return new Iterator(cnt.size(),cnt);
    }
}
