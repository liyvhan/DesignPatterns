/**
 * 备忘录模式
 * 为了恢复状态，设置备忘录，存一些对象的状态
 * 原则：保持封闭性（不能通过备忘录去访问到私有类成员），又要保存好状态
 * 方法：C++可通过友元函数，Java可以default函数，放到一个包中达到类似友元的方法
 * 通过管理员统一管理备忘录，管理员同样没有权限去访问备忘录的私有类成员
 */
package ActionPatterns.Memento.others;

import ActionPatterns.Memento.OriginatorAndItsMemento.Originator;

public class App {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.show();
        caretaker.addMemento(originator.CreateMemento());
        originator.setState(2);
        originator.show();
        originator.SetMemento(caretaker.getMemento(0));
        originator.show();
    }
}
