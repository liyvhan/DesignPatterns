package ActionPatterns.Command;
public class ConcreteCommand1 implements Command{
    private int used = 0;

    public ConcreteCommand1(int used){
        this.used = used;
    };

    @Override
    public void Execute() {
        System.out.println("This is a concretecommand1");
    }

    @Override
    public void undo() {

    }

    public int getUsed() {
        return used;
    }
}
