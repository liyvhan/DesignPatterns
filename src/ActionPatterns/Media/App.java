/**
 * 目的：分割各组件，解耦，减少各个组件之间的依赖性
 * 思想：加入一个中间件，使得中间件来协调各个组件之间的工作
 * 调用者，各个组件都只和中间件沟通
 */
package ActionPatterns.Media;

public class App {
    public static void main(String[] args) {
        Mediator me = new Mediator();
        College1 college1 = new College1(me);
        College2 college2 = new College2(me);
        College3 college3 = new College3(me);
        Client client = new Client(me);
        me.Init(college1,college2,college3);

        client.processAll();
    }
}
