import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        double accountBalance=0;
        Scanner scanner=new Scanner(System.in);
        String choice = "";
        while(!choice.equals("q")){
            System.out.println("a. Withdraw, b. Deposit, c. Balance Enquiry, q. Quit");
            System.out.println("Enter your choice: ");
            choice=scanner.next();
            switch (choice){
                case "a":
                    System.out.println("Enter amount to be withdrawn: ");
                    double amount = Double.parseDouble(scanner.next());
                    if (accountBalance > amount) {
                        accountBalance -= amount;
                        System.out.println("Amount Withdrawn");
                        System.out.println("Updated Balance = " + accountBalance);
                    }
                    else {
                        System.out.println("Insufficient account balance");
                    }
                    break;
                case "b":
                    System.out.println("Enter amount to be deposited: ");
                    double depositamount = Double.parseDouble(scanner.next());
                    accountBalance += depositamount;
                    System.out.println("Amount Deposited");
                    System.out.println("Updated Balance = " + accountBalance);
                    break;
                case "c":
                    System.out.println("Account Balance: " + accountBalance);
                    break;
                case "q":
                    System.out.println("Thankyou!");
                    break;
                default:
                    System.out.println("Incorrect choice!");
                    break;
            }
        }
    }
}
