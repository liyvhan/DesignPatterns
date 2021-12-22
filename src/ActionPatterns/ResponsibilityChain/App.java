/**
 * 责任链模式
 * 优点：调用者可以不必知道哪个具体的类来处理请求，达到解耦的目的
 * 符合开闭原则
 * 方法：常和组合模式一起用，父类作为下一个请求
 * 缺点：请求不一定被处理
 * 对较长的责任链影响性能
 */
package ActionPatterns.ResponsibilityChain;

public class App {
    public static void main(String[] args) {
        Client c = new Client();
        c.test();
    }
}
