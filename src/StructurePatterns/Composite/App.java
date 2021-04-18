/**
 * 组合模式
 * 递归组合
 * 有图元（无子节点），和容器（由多个子Compoment组成）
 * 就。。。很简单的组合
 */
package StructurePatterns.Composite;

public class App {
    public static void main(String[] args) {
        Compoment cnt = new Composite();
        cnt.Add(new LeafA());
        cnt.Add(new LeafB());
        cnt.Operation();
    }
}
