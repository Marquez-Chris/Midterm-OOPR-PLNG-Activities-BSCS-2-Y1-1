import java.util.Scanner;

public class MIDTERMLabActivity6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
 
        double balance;

        
     
        switch (choice){
            case 1:
                System.out.println("Enter your balance");
                balance = sc.nextDouble();
                prog1(balance);
                break;
            default:
                System.out.println("Error");
                break;
        }



    public static void prog1(double balance) {
        int choices;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("---------------------------------------");
            System.out.println("1. Withdraw Amount ");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            choices = sc.nextInt();

            switch (choices) {
                case 1:
                    balance = withdraw(balance);
                    break;
                case 2:
                    balance = deposit(balance);
                    break;
                case 3:
                    System.out.println("Returning to main menu......");
                    break;
                default:
                    System.out.println("Error invalid choice!!....");
                    break;
            }

        } while (choices != 3);
    }
        public static double withdraw(double balance){
            Scanner sc = new Scanner(System.in);
            System.out.println("How much amount do you wan to withdraw to your account?\n Amount: ");
            double withdrawAmount = sc.nextDouble();
            if (withdrawAmount > balance) {
                System.out.println("Error: Insufficient funds.");
            } 
            else {
                balance -= withdrawAmount;
                System.out.println("Your new balance is: " + balance);
            }
        return balance;
    }
        public static void deposit (double balance){
            Scanner sc = new Scanner(System.in);
            System.out.println("How much amount do you wan to deposit to your account?\n Amount: ");
            double deposit = sc.nextDouble();
            balance += deposit;
            System.out.println("Your new balance is: " + balance);
        }
    }
}
