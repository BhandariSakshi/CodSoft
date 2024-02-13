import java.util.Scanner;

public class Atm {
    private double balance;

    public Atm(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Your balance is Rs " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
        checkBalance();
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs" + amount + " withdrawn successfully.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds.");
        }
        checkBalance();
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Atm atm = new Atm(initialBalance);

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice your: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs ");
                    double depositAmt = scanner.nextDouble();
                    atm.deposit(depositAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs ");
                    double withdrawAmt = scanner.nextDouble();
                    atm.withdraw(withdrawAmt);
                    break;
                
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
