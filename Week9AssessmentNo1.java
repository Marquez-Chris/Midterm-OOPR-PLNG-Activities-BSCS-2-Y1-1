import java.util.Scanner;
public class Week9AssessmentNo1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        do{
            System.out.println("=======Loops NAME======= \n Choose 1-4");
            System.out.println("1. - While Loop");
            System.out.println("2. - Do-While Loop");
            System.out.println("3. - For Loop");
            System.out.println("4. - Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n=== Output (While Loop) ===");
                    Whileloop.printName(name);
                    break;
                case 2:
                    System.out.println("\n=== Output (Do-While Loop) ===");
                    doWhileloop.printName(name);
                    break;
    
                case 3:
                    System.out.println("\n=== Output (For Loop) ===");
                    Forloop.printName(name);
                    break;
                case 4:
                    System.out.println("BYE");
                    break;

                default:
                    
                    break;
                }

        }while (choice !=4);
            
    
         sc.close();
    }
    class doWhileloop{
        public static void printName(String name){
            int count = 1;
            do{
                System.out.println(name);
                count++;
            }while (count <= 5);
        }
    }
    class Whileloop{
        public static void printName(String name){
            int count = 1;
            while(count <= 5){
                System.out.println(name);
                count++;
        }
    }
    }
    class Forloop{
        public static void printName(String name){
            for(int i = 1; i <=5; i++){
                System.out.println(name);
            }
        }
    }
}


