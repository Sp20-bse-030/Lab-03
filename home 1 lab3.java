package circle;

public class Circle {
 double radius;
 double pye;
 public Circle(){
     radius = 5;
     pye = 3.14;
 }
 public Circle(int r,double pi){
     radius = r;
     pye = pi;
 }
 
 public void CalCircumfarence(){
     double circumfarence = 2*pye*radius;
     System.out.println("The circumfarance of the circle is "+ circumfarence);
 }   
}
