public class LinearSearch{
     public static void main(String []args){
         String[] list = {"Sinan","kartik","Raj","Swastilk"};
         System.out.print("Enter your string\n");
         String searchName = new java.util.Scanner(System.in).nextLine();
        
         for(String se : list){
            if(se.contains(searchName)){
                System.out.println(se+" is Found in list");
                System.exit(0);
            }
         }
         System.out.print("Not found");
              
         }
     }
    
