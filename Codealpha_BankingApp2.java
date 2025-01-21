import java.util.Scanner;

public class BankingApp {

    // Global variable to store the account balance
    static double balance = 0.0;

    // Method to deposit money into the account
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited: $" + amount);
        } else {
            System.out.println("Please enter a positive amount to deposit.");
        }
    }

    // Method to withdraw money from the account
    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Please enter a positive amount to withdraw.");
        } else {
            System.out.println("Insufficient balance! Your current balance is: $" + balance);
        }
    }

    // Method to check the current balance
    public static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Display the menu options
            System.out.println("\n--- Simple Banking Application ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            option = scanner.nextInt();

            // Switch case to handle the users choice
            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our banking service!");
                    break;

                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        } while (option != 4); // Repeat until the user chooses to exit

        scanner.close();
    }
}