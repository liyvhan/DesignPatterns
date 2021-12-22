package ActionPatterns.ResponsibilityChain;

public class ConcreteHandler1 extends Handler{
    public ConcreteHandler1(Handler successor, int TOPIC) {
        super(successor, TOPIC);
    }

    @Override
    void HandleRequest() {
        if(TOPIC!=-1)
            System.out.println("Process quest1");
        else{
            System.out.println("Cannot handle this service , reponsibility move to next handler");
            super.HandleRequest();
        }
    }
}
