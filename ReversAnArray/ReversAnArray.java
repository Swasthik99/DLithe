import java.util.Scanner;

public class ReversAnArray {
     public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        //declaraion of array
        int [] arr;
        int arrSize;
        arrSize= in.nextInt();
        //creation of array
        arr = new int[arrSize];
        //getting values for an array
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // reversing an array
        for ( int i=0, j= arrSize-1; i<j; i++, j--){
            arr[i] = arr[i] + arr[j] - (arr[j]=arr[i]);
        }
        for (int i=0 ; i< arrSize; i++){
            System.out.print(arr[i]);
        }

     }
    
}
