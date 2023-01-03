package bubble_sort;

public class bubble_sort {
    
    public static void main (String[] args){
        String [] nameList = {"Sinan","karthik","Raj","Swastilk"};
        for (int i=0; i<nameList.length-1; i++)
            for (int j = i+1; j<nameList.length; j++)
                if (nameList[i].compareTo(nameList[j]) >0){
                    String temp = nameList[i];
                    nameList[i] = nameList[j];
                    nameList[j] = temp;

                }
                //Printing the sorted names
        for( int i=0; i<nameList.length; i++){
            System.out.println(nameList[i].toUpperCase());
                }
            
        
    }
}
