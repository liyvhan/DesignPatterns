/**
 * 目的：传统类都和一组方法绑定，一个类对应一组方法代码
 *      而有时候调用者不知道具体哪一个类来处理请求
 * 思想：将请求封装成类，类中没有成员变量，只有execute()函数
 *      如此可以参数化的去定义对象的方法，将方法和实体类解耦
 *          同时，请求类还可以去实现undo函数，从而可以处理事务
 *
 * 缺点：需要去维护更多的类
 */
package ActionPatterns.Command;

public class App {
    public static void main(String[] args) {
        Invoker client = new Invoker();
        client.setCommands(new ConcreteCommand1(1));
        client.setCommands(new ConcreteCommand2());
        client.process1();
        client.process2();

    }
}
