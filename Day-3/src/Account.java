import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        String choice = "x";
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 0;
        while (!choice.equals("q")) {
            System.out.println("a. Withdrawal b. Deposit c. BalanceEnquiry q. Quit");
            System.out.println("Enter your choice: ");
            choice = scanner.next();
            switch (choice) {
                case "a":
                    System.out.println("Enter the amount to be withdrawn");
                    double withdrawAmount = scanner.nextDouble();
                    if (accountBalance >= withdrawAmount) {
                        accountBalance -= withdrawAmount;
                        System.out.println("Amount withdrawn successfully");
                        System.out.println("Updated Balance = " + accountBalance);
                    } else {
                        System.out.println("Sorry, Insufficient Balance!");
                    }
                    break;
                case "b":
                    System.out.println("Enter the amount to be deposited");
                    double depositAmount = scanner.nextDouble();
                    accountBalance += depositAmount;
                    System.out.println("Amount deposited successfully");
                    System.out.println("Updated Balance = " + accountBalance);
                    break;
                case "c":
                    System.out.println("Account Balance = " + accountBalance);
                    break;
                case "q":
                    System.out.println("Thankyou!");
                    break;
                default:
                    System.out.println("Incorrect Choice!");
                    break;
            }
        }
    }
}