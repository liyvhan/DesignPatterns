package ActionPatterns.Media;

public class College3 {
    private Mediator me;

    public College3(Mediator me) {
        this.me = me;
    }

    public   void tellOne(){
        me.process(1);
    }

    public   void tellTwo(){
        me.process(2);
    }

    public void prcess(){
        System.out.println("College3 process");
    }
}
