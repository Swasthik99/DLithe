package labdemo;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double num1,num2,result;
		char op;
		num1=in.nextDouble();
		num2=in.nextDouble();
		op=in.next().charAt(0);
		if(op== '+')
			result=num1+num2;
		else if(op == '-')
			result = num1-num2;
		else if(op == '*' || op== 'x' || op == 'X')
			result = num1*num2;
		else if(op == '/')
			result = num1/num2;
		else if(op == '%')
			result = num1%num2;
		else {
			System.out.println("Invalid Operator!!");
			return;
		}


	}

}
