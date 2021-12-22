package ActionPatterns.ResponsibilityChain;

public class ConcreteHandler2 extends Handler{
    public ConcreteHandler2(Handler successor, int TOPIC) {
        super(successor, TOPIC);
    }

    @Override
    void HandleRequest() {
        if(TOPIC!=-1){
            System.out.println("Process handle 2");
        }
        else{
            System.out.println("Cannot handle this service , reponsibility move to next handler");
            super.HandleRequest();
        }

    }
}
