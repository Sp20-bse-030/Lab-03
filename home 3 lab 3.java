package circle;

public class Distance {
    int feets;
    int inches;
    public Distance(){
        feets = 5;
        inches = 10;
        
    }
    public Distance( int f, int i){
        feets = f;
        inches = i;
    }
    public void Display(){
        System.out.println("feets = "+ feets);
        System.out.println("inches = "+ inches);
    }
    
}
