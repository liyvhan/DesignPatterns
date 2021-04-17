package CreatePatterns.Builder;

public class ConcreteBuilder implements  Builder{
    @Override
    public void BuildPart() {
        System.out.println("Create a part");
    }
}
