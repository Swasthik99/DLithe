package labdemo;

import java.util.Scanner;

public class SimpleCalculator1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double num1,num2,result;
		char op;
		num1=in.nextDouble();
		num2=in.nextDouble();
		op=in.next().charAt(0);
		switch(op)
		{
		case '+': result=num1+num2;
				  break;
		case '-': result=num1-num2;
				  break;
		case '*': result=num1*num2;
				  break;
		case '/': result=num1/num2;
				  break;
		case '%': result=num1%num2;
		          break;
		default: System.out.println("Inavlid operator");
		         return;
		}
       System.out.println(num1 +" "+ op +" "+ num2+ "="+ result);
	}

}
