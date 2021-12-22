package ActionPatterns.ResponsibilityChain;

public abstract class Handler {
    void HandleRequest(){
        successor.HandleRequest();
    };
    protected   Handler successor;
    protected   int TOPIC = -1;

    public Handler(Handler successor, int TOPIC ) {
        this.successor = successor;
        this.TOPIC = TOPIC;
    }
}
