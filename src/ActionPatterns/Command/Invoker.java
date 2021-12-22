package ActionPatterns.Command;

import java.util.ArrayList;

public class Invoker {
    private final ArrayList<Command> commands = new ArrayList<Command>();

    public  void setCommands(Command cmd){
        commands.add(cmd);
    }

    public  void process1(){
        commands.get(0).Execute();
    }

    public  void process2(){
        commands.get(1).Execute();
    }

}
