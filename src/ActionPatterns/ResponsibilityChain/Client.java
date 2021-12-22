package ActionPatterns.ResponsibilityChain;

public class Client {
    public void test(){
        Handler hanf = new ConcreteHandler1(null,0);
        Handler han2 = new ConcreteHandler2(hanf,-1);
        han2.HandleRequest();
    }
}
