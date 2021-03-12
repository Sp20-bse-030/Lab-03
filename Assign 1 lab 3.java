package circle;

public class Marks {
    int math,english,physics;
    public Marks(){
        math = 70;
        english = 80;
        physics = 90;
    }
     public Marks(int m1,int m2,int m3){
        math = m1;
        english = m2;
        physics = m3;
     }
     public void calSum(){
         int sum;
         sum = math+english+physics;
         System.out.println("you having total marks "  + sum);
     }
}
