package ActionPatterns.Command;

public class ConcreteCommand2 implements  Command{
    private  int used = 0;

    public ConcreteCommand2() {
    }

    public ConcreteCommand2(int used) {
        this.used = used;
    }

    @Override
    public void Execute() {
        System.out.println("This is a concrete cimmand 2");
    }

    @Override
    public void undo() {

    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
