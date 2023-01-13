
public class Bank_cls{
    // Data members
        long accNumber;
        String accName;
        double balance;
        //constructor
        public Bank_cls() {
          accNumber = 245667885;
          accName = "swas";
          balance = 1000000;
        }
        //Parameterized constructor
        public Bank_cls(long accNumber, String accName, double balance) {
            this.accNumber = accNumber;
            this.accName = accName;
            this.balance = balance;
        }
        public void withdraw(double amount){
            if(amount % 100 ==0){
                if(amount > balance){
                    throw new NullPointerException("Insuficient Fund!");
                else {
                    balance = balance - amount;
                    System.out.println("Current Balance : " +balance);
                }
                }
            else
               throw new NullPointerException("Amount should be multiples of 100");
            }

        }
        public void deposit(double amount){
            if(amount % 100 ==0){
                if(amount > 0){
                    throw new NullPointerException("Insuficient Fund!");
                else {
                    balance = balance - amount;
                    System.out.println("Balance : " +balance);
                }
                }
            else
               throw new NullPointerException("Amount should be multiples of 100");
            }
            
        }

    }
    