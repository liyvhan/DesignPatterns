package CreatePatterns.Builder;
/*
将复杂的对象的构建与他的表示分离
算法独立于该对象的组成部分与装配方式
被构造的对象可以有不同的表示

通过向函数里传构造器的方式来构建对象
 */
public class Director {
       public void CreateProduct(Builder builder){
            builder.BuildPart();
       }

    public static void main(String[] args) {
           Director a=new Director();
           Builder builder= new ConcreteBuilder();
           a.CreateProduct(builder);
    }
}
