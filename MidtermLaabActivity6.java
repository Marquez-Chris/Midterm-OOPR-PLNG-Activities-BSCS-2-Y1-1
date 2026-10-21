import java.util.Scanner;

public class MidtermLaabActivity6 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int mainMenuChoice;

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Run Banking Program");
            System.out.println("2. Run Hospital Program");
            System.out.println("3. Professor nigga");
            System.out.println("4. Exit Entire Application");
            System.out.print("Select which program to run: ");
            mainMenuChoice = sc.nextInt();

            switch (mainMenuChoice) {
                case 1:
             
                    System.out.print("Enter your initial balance: ");
                    double balance = sc.nextDouble();
                    bankingProgram(balance);
                    break;
                case 2:
                    HospitalProgram();
                    break;
                case 3:
                    runProfessorTest();
                    break;
                case 4:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (mainMenuChoice != 3);
    }


    public static void bankingProgram(double balance) {
        int choices;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Withdraw Amount ");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choices = sc.nextInt();
            
            switch (choices) {
                case 1:
                    balance = withdraw(balance);
                    break;
                case 2:
                    balance = deposit(balance);
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Error: Invalid Choice");
            }
        } while (choices != 3);
    }

    public static double withdraw(double balance) {
        System.out.print("How much amount do you wan to withdraw to your account?.\nAmount: ");
        double withdrawAmount = sc.nextDouble();
        if (withdrawAmount > balance) {
            System.out.println("Error: Insufficient funds.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Your new balance is: " + balance);
        }
        return balance;
    }

    public static double deposit(double balance) {
        System.out.print("How much amount do you wan to deposit to your account?.\nAmount: ");
        double depositAmount = sc.nextDouble();
        balance += depositAmount;
        System.out.println("Your new balance is: " + balance);
        return balance;
    }

 
    public static void HospitalProgram() {
        final int MAX_PATIENTS = 100;
        String[] names = new String[MAX_PATIENTS];
        String[] diseases = new String[MAX_PATIENTS];
        int[] ages = new int[MAX_PATIENTS];

        
        int[] admDays = new int[MAX_PATIENTS];
        int[] admMonths = new int[MAX_PATIENTS];
        int[] admYears = new int[MAX_PATIENTS];

       
        int[] disDays = new int[MAX_PATIENTS];
        int[] disMonths = new int[MAX_PATIENTS];
        int[] disYears = new int[MAX_PATIENTS];

        int currentPatientCount = 0;
        int menuChoice;

         do {
            System.out.println("\n===== HOSPITAL INDOOR PATIENT DATABASE =====");
            System.out.println("1. Add New Patient Records");
            System.out.println("2. Display All Patients");
            System.out.println("3. List Pediatric Patients (Age < 12)");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("How many patient records do you want to add? ");
                    int count = sc.nextInt();
                    
                    for (int i = 0; i < count; i++) {
                        if (currentPatientCount >= MAX_PATIENTS) {
                            System.out.println("Database is full!");
                            break;
                        }

                        System.out.println("\n--- Entering Details for Patient #" + (currentPatientCount + 1) + " ---");
                        
                        System.out.print("Enter Patient Name: ");
                        sc.nextLine(); 
                        names[currentPatientCount] = sc.nextLine();

                        System.out.println("Enter Date of Admission:");
                        System.out.print("  Day (DD): "); admDays[currentPatientCount] = sc.nextInt();
                        System.out.print("  Month (MM): "); admMonths[currentPatientCount] = sc.nextInt();
                        System.out.print("  Year (YYYY): "); admYears[currentPatientCount] = sc.nextInt();

                        System.out.print("Enter Disease/Diagnosis: ");
                        sc.nextLine(); 
                        diseases[currentPatientCount] = sc.nextLine();

                        System.out.println("Enter Date of Discharge:");
                        System.out.print("  Day (DD): "); disDays[currentPatientCount] = sc.nextInt();
                        System.out.print("  Month (MM): "); disMonths[currentPatientCount] = sc.nextInt();
                        System.out.print("  Year (YYYY): "); disYears[currentPatientCount] = sc.nextInt();

                        System.out.print("Enter Patient Age: ");
                        ages[currentPatientCount] = sc.nextInt();

                        currentPatientCount++;
                    }
                    break;

                case 2:
                    if (currentPatientCount == 0) {
                        System.out.println("The database is currently empty.");
                    } else {
                        System.out.println("\n===== ALL PATIENT RECORDS =====");
                        System.out.println("---------------------------------------");
                        for (int i = 0; i < currentPatientCount; i++) {
                            System.out.println("Name: " + names[i]);
                            System.out.println("Admitted On: " + admDays[i] + "/" + admMonths[i] + "/" + admYears[i]);
                            System.out.println("Disease: " + diseases[i]);
                            System.out.println("Discharged On: " + disDays[i] + "/" + disMonths[i] + "/" + disYears[i]);
                            System.out.println("Age: " + ages[i] + " years old");
                            System.out.println("---------------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===== PEDIATRIC PATIENTS LIST (< 12 Years Old) =====");
                    System.out.println("---------------------------------------");
                    boolean foundPediatric = false;
                    
                    for (int i = 0; i < currentPatientCount; i++) {
                        if (ages[i] < 12) {
                            System.out.println("Name: " + names[i]);
                            System.out.println("Admitted On: " + admDays[i] + "/" + admMonths[i] + "/" + admYears[i]);
                            System.out.println("Disease: " + diseases[i]);
                            System.out.println("Discharged On: " + disDays[i] + "/" + disMonths[i] + "/" + disYears[i]);
                            System.out.println("Age: " + ages[i] + " years old");
                            System.out.println("---------------------------------------");
                            foundPediatric = true;
                        }
                    }
                    
                    if (!foundPediatric) {
                        System.out.println("No pediatric patients found matching this criteria.");
                    }
                    break;

                case 4:
                    System.out.println("Returning to main application selector...");
                    break;

                default:
                    System.out.println("Invalid input. Please choose a valid option.");
            }
        } while (menuChoice != 4);
    }
    static class Professor {
        private String name;
        private double salary;

        public Professor(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() { return name; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return "Name: " + name + ", Salary: $" + salary;
        }
    }

    static class Dean extends Professor {
        private String department;

        public Dean(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
    }
    static class Executive extends Dean {
        public Executive(String name, double salary, String department) {
            super(name, salary, department);
        }
    }
    public static void runProfessorTest() {
        System.out.println("\n===== EXECUTION: PROFESSOR CLASS =====");
        Professor prof = new Professor("Dr. Alan Turing", 85000);
        System.out.println(prof.toString());

        System.out.println("\n===== EXECUTION: DEAN CLASS =====");
        Dean dean = new Dean("Dr. Grace Hopper", 120000, "Computer Science");
        System.out.println(dean.toString());

        System.out.println("\n===== EXECUTION: EXECUTIVE CLASS =====");
        Executive exec = new Executive("Dr. Ada Lovelace", 165000, "Engineering & Technology");
        System.out.println(exec.toString());
        
        System.out.println("\nPress Enter to return to Main Menu...");
        sc.nextLine(); 
        sc.nextLine(); 
    }

}

