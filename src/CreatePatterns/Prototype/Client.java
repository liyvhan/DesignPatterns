package CreatePatterns.Prototype;

public class Client {
    private ConcretePrototype1 c1 = new ConcretePrototype1();
    private ConcretePrototype2 c2 = new ConcretePrototype2();

    Prototype Operation() {
        Prototype ans = c2.Clone();
        System.out.println("Create a concrete prototype");
        return ans;
    }
}
