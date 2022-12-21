package max;
import java.util.Scanner;
public class second_max {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size, min, smin;
		min=smin=Integer.MAX_VALUE;//2147483647
		size=in.nextInt();
		//min=in.nextInt();
		//smin=in.nextInt();
		//swaping two numbers
		 //min = (min+smin)-(smin=min);
		 //System.out.print("Second min: " +smin);
		for(int i = 1; i<=size; i++) {
			int x = in.nextInt();
		    if(min >= x) {
		    	smin=min;
			    min = x;
		    }
		    else if(smin > x && x > min)
		    	smin=x;
		    

	}
	System.out.print("Second min: " +smin);
	}
}
