package ActionPatterns.Memento.OriginatorAndItsMemento;

public class Originator {
     int state = 0;
     public void SetMemento(Memento m){
         System.out.println("Set  from a memento");
         state = m.getState();
     }

     public Memento CreateMemento(){
         System.out.println("Create a memento");
         return new Memento(state);
     }

    public void setState(int state) {
        this.state = state;
    }

    public void show(){
         System.out.println("state="+state);
     }
}
