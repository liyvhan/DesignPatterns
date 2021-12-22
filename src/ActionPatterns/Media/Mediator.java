package ActionPatterns.Media;

public class Mediator {
    College1 college1;
    College2 college2;
    College3 college3;

    public void Init(College1 college1, College2 college2, College3 college3) {
        this.college1 = college1;
        this.college2 = college2;
        this.college3 = college3;
    }

    public  void process(int i){
        if(i==1){
            college1.prcess();
        }else if(i == 2){
            college2.prcess();
        }else if(i==3){
            college3.prcess();
        }
    }
}
