// public class BreakDemo {

//     public static void main(String [] args) {
//         loop1:
//         for(int i=1; i<=5; i++){
//             loop2:
//             for(int j = 1; j<=10; j++){
//                 if(j%3==0)
//                      break;
//                     //break loop1;
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
    
// }

public class BreakDemo {

    public static void main(String [] args) {
        loop1:
        for(int i=1; i<=5; i++){
            loop2:
            for(int j = 1; j<=10; j++){
                if(j%3==0)
                 //continue;
                continue loop1;
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
