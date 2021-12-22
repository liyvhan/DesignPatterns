package ActionPatterns.Memento.others;

import ActionPatterns.Memento.OriginatorAndItsMemento.Memento;

import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> mementos = new ArrayList<Memento>();
    public  void addMemento(Memento a){
        mementos.add(a);
    }

    public Memento getMemento(int i){
        return  mementos.get(i);
    }
}
