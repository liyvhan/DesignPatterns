package CreatePatterns.Prototype;

public class ConcretePrototype2 implements  Prototype{
    @Override
    public Prototype Clone() {
        ConcretePrototype2 ans = this;
        return ans;
    }

    @Override
    public void Show() {
        System.out.println("This is a ConcretePrototype2");
    }
}
