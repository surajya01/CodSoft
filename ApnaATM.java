import java.util.Scanner;

public class ApnaATM
{

    private static double balance = 1000.00; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the APNA ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice:");
            choice = scanner.nextInt();



            switch (choice)
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using  ApnaATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        while (choice != 4);

        scanner.close();
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: ₹%.2f%n", balance);
    }

    private static void depositMoney(Scanner scanner)
    {
        System.out.print("Enter the amount: ");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0)
        {
            balance += depositAmount;
            System.out.printf("Successfully deposited $%.2f. Your new balance is: ₹%.2f%n", depositAmount, balance);
        } else
        {
            System.out.println("Invalid amount. Please enter a valid amount.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.printf("Successfully withdrew ₹%.2f. Your new balance is: ₹%.2f%n", withdrawAmount, balance);
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a valid amount.");
        }
    }
}
