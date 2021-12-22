package ActionPatterns.Memento.OriginatorAndItsMemento;

public class Memento {
    private  int state;
    Memento(int s){
        this.state=s;
    }

    int getState(){
        return state;
    }
}
