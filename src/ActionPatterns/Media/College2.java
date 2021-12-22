package ActionPatterns.Media;

public class College2 {
    private Mediator me;

    public College2(Mediator me) {
        this.me = me;
    }

    public void tellOne(){
        me.process(1);
    }

    public   void tellThree(){
        me.process(3);
    }
    public void prcess(){
        System.out.println("College2 process");
        tellThree();
    }
}
