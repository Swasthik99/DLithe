package OOPs;

public class MyDate {

    private int dd, mm, yy;
    
     private boolean isValid(int d, int m ,int y){
        if(d>31 || d<1 || m>12||  m<1 || y =< 1)
           return;
        else{
            switch(m){
                case 4: case 6: case 9: case 11:
                   if (d>30) return false;
                   break;
                case 2:
                  if (isLeapYear(d>28) return false);
            }
        }

     }
     public void setDate(int day, int month, int year){
        dd = day;
        mm = month;
        yy = year;                                                           
    

    }
    public void printDate(){
        System.out.println();
    }
    
}
