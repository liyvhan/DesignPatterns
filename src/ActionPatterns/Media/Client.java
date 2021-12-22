package ActionPatterns.Media;

public class Client {
    Mediator me;

    public Client(Mediator me) {
        this.me = me;
    }

    void processAll(){
        me.process(1);
    }
}
