/**
 * 懒汉式：延迟加载
 */
package CreatePatterns.Singleton;

public class Singleton2 {
    private  static  Singleton2 instance;
    private  Singleton2(){};

    public static  Singleton2 getInstance(){
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }

}
