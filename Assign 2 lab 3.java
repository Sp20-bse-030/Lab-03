package circle;

public class Time {
    int hours;
    int minutes;
    int seconds;
    public Time(){
        hours = 12;
        minutes = 35;
        seconds = 45;
    }
    public Time(int h,int m,int s){
        hours = h;
        minutes = m;
        seconds = s;
        if(hours>12||minutes>60||seconds>60){
            System.out.println("you enter wrong time");
        }
        else{
            System.out.println("its " +hours +":"+ minutes +":"+ seconds + " time at the moment");
        }
            
    }
    public void Display(){
        System.out.println("its " +hours +":"+ minutes +":"+ seconds + " time at the moment");
    }
    
}
