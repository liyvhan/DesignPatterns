/**
 * 原型模式
 * 在Client类中创建一系列原型
 * 原型中实现Clone()函数克隆原型本身
 * 在构造产品时，调用原型的Clone获得一个该原型
 */
package CreatePatterns.Prototype;
public class App {
    public static void main(String[] args) {
        Client a=new Client();
        Prototype tem = a.Operation();
        tem.Show();
    }


}