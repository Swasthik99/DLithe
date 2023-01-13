package OOPs;

public class Calculator {

  public static long powerInt( int num1, int num2){
      //return (int) Math.pow(num1, num2);
      long result = num1;
      for(int i = 2; i<=num2; result*=num1, i++);
      return result;

    }
    public static double powerDouble( Double i, Double j){
        return (double) Math.pow(i, j);
  
      }
    
    
}
