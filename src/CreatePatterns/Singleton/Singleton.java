/**
 * 单例模式：保证只能有一个实例，而且用户可以访问它
 *
 * 饿汉式：
 * 立即加载
 */
package CreatePatterns.Singleton;

public class Singleton {
    static  Singleton instance(){
        return uniqueInstance;
    };
    private static Singleton uniqueInstance = new Singleton();
    private  Singleton(){};

    private  int singletonData;
    public void SingletonOperation(){
        System.out.println("In CreatePatterns.Singleton class, we only have one CreatePatterns.Singleton Class");
    };
    public void GetSingletonData(){

    };
}
