package ActionPatterns.Media;

public class College1 {
    private  Mediator me;

    public College1(Mediator me) {
        this.me = me;
    }

    public void tellTwo(){
        me.process(2);
    }

    public void prcess(){
        System.out.println("College1 process");
        tellTwo();
    }

    public   void tellThree(){
        me.process(3);
    }
}
