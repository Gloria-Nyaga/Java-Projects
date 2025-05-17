package atmSystem;
import java.util.Scanner;

public class AtmSystem {
    public void calculate() {
    }

    // QUESTION:
    // Simulate an ATM that: Accepts withdrawal amount. Checks if it is divisible by 100. Denies if insufficient balance or invalid amount. Dispenses cash using denominations (100s, 500s, 2000s)


    // Simulate an ATM that: Accepts withdrawal amount.
    // Checks if it is divisible by 100.
    // Denies if insufficient balance or invalid amount.
    // Dispenses cash using denominations (100s, 500s, 2000s)

    public static void main(String[] args) {

        int currentAccountBalance = 1200000;
        Scanner scanner = new Scanner(System.in);
        boolean accountAtm = true;

        while (accountAtm) {
            System.out.println("\nWelcome to My ATM System");
            System.out.println("1. Check Account Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Exit");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is: Ksh " + currentAccountBalance);
                    break;

                case 2:
                    boolean checkWithdrawal = false;
                    int withdrawAmount = 0;

                    while (!checkWithdrawal) {
                        System.out.println("Your current balance is: Ksh " + currentAccountBalance);
                        System.out.print("Enter amount to withdraw (must be divisible by 100): ");
                        withdrawAmount = scanner.nextInt();

                        if (withdrawAmount % 100 != 0) {
                            System.out.println("Amount not divisible by 100. Please try again.");
                        }

                        else if (withdrawAmount > currentAccountBalance) {
                            System.out.println("Insufficient balance. Please try again.");
                        }

                        else if (withdrawAmount <= 0) {
                            System.out.println("Invalid amount. Amount must be greater than 0.");
                        }

                        else {
                            checkWithdrawal = true;
                        }
                    }

                    System.out.println("Amount to withdraw: Ksh " + withdrawAmount);

                    int kshIn2000s = withdrawAmount / 2000;
                    withdrawAmount %= 2000;

                    int kshIn500s = withdrawAmount / 500;
                    withdrawAmount %= 500;

                    int kshIn100s = withdrawAmount / 100;

                    System.out.println("Please collect your cash:");
                    if (kshIn2000s > 0) System.out.println("Ksh 2000 notes: " + kshIn2000s);
                    if (kshIn500s > 0) System.out.println("Ksh 500 notes: " + kshIn500s);
                    if (kshIn100s > 0) System.out.println("Ksh 100 notes: " + kshIn100s);

                    int totalWithdrawnAmount = (kshIn2000s * 2000) + (kshIn500s * 500) + (kshIn100s * 100);
                    currentAccountBalance = currentAccountBalance - totalWithdrawnAmount;

                    System.out.println("Withdrawal successful. New account balance is: Ksh " + currentAccountBalance);
                    break;

                case 3:
                    System.out.println("Thank you for using the ATM System. Goodbye!");
                    accountAtm = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
