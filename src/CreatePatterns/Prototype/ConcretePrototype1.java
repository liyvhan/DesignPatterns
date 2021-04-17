package CreatePatterns.Prototype;

public class ConcretePrototype1 implements  Prototype{
    int type;
    @Override
    public Prototype Clone() {
        ConcretePrototype1 ans= new ConcretePrototype1();
        ans.type=this.type;
        return ans;
    }

    @Override
    public void Show() {
        System.out.println("This is a ConcretePrototype1");
    }
}
