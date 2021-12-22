/**
 * 迭代器模式
 * 不曝漏数据结构内部结构的情况下访问容器
 * 参考STL源码迭代器·
 */
package ActionPatterns.Iterator;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        Container cnt = new Container(a);
        Iterator it = cnt.first();
        while (it!=cnt.end()){
            System.out.println(it.get());
            it=it.next();
        }

    }
}
