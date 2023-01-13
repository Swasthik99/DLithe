package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class B_S {
    public static void main(String [] args){
        String[] nameList = {"Sinan","kartik","Raj","Swasthik"};
        Arrays.sort(nameList); // QuickSort
        int lb=0, ub= nameList.length-1;
        String searchName = new java.util.Scanner(System.in).nextLine();
        while(ub>=lb){
            int Middle = (lb+ub)/2;
            if(nameList[Middle].equals(searchName)){
                    System.out.println("Found @"+(Middle+1));
                    return;  //terminate the application
            }
            else if (nameList[Middle].compareTo(searchName)>0)
                ub = Middle - 1;
            else 
                lb = Middle + 1;
        }
            System.out.println("Not found");
       }
}
