package CreatePatterns.Singleton;

public class App {
    public static void main(String[] args) {
        Singleton sininstance = Singleton.instance();
        Singleton2 sin2 = Singleton2.getInstance();
        sininstance.SingletonOperation();
    }

}
