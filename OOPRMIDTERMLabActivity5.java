import java.util.Scanner;
public class OOPRMIDTERMLabActivity5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PBalance = 0;
        double NBalance = 0;
        System.out.print("Welcome to OOP Banking System"+".\n");
        System.out.print("Opening Balance: ");
        
        while (true){
            if (scanner.hasNextInt()) {
                double Balance = scanner.nextInt();
                if (Balance > 0) {
                    PBalance = Balance;
                    break; 
                } else {
                    System.out.print("Invalid! That is not a positive number. Try again.\n");
                }
            } else {
                System.out.print("Invalid! That is not a number. Try again type it again.");
                scanner.next(); 
            }
        }
        System.out.print("Current Accout Savings/Checking: ");
        String Acc = scanner.next();
        System.out.print("Current Accout Savings/Checking: " + Acc + " | " + "Balance: " + String.format("%.2f\n", (double)PBalance));
        switch (Acc.toLowerCase()){
            case "savings" :
                while (true) {
                    int choice = 0;
                    System.out.print("\n1 Withdraw    2 Deposit   3 Show balance  4 Switch account 5 Exit\n");
                    System.out.print("Choice: ");
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Amount to withdraw: ");
                                double with = scanner.nextInt();
                                NBalance = PBalance - with;
                                PBalance = NBalance;
                                System.out.print("\nWithdrawal fee: 0.00" + " | " + "Balance: " + String.format("%.2f", (double)NBalance));
                                break;
                            case 2:
                                System.out.print("Amount to deposit: ");
                                double depo = scanner.nextInt();
                                NBalance = PBalance + depo;
                                PBalance = NBalance;
                                System.out.print("\nNew Savings Balance: " + String.format("%.2f", (double)NBalance));
                                break;
                            case 3:
                                System.out.print("Balance: "+ String.format("%.2f", (double)NBalance));
                                break;
                            case 4:
                                
                                
                                break;
                            case 5:
                                System.out.print("Thank you for using the system");
                                break;
                            default:
                                System.out.print("Unknown transaction.");
                                break;
                        }
                    }
                    if (choice == 5) {
                        System.out.print("Thank you for using the system");
                        break; 
                    }
                }
                break;
            case "checking" :
                
                break;
            default:
                System.out.print("Unknown command.");
                break;
        
        }
    }
    public static void saving() {
    }
}