import java.io.*;
import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            Conversion conversion = new Conversion();
            FileWriter fileWriter = new FileWriter("C:\\Users\\91892\\Documents\\UST\\UST Prograd Training\\Hackathon\\log.txt", true);
            System.out.println("*****Welcome to Currency Convertor*****");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Admin \n2. User \n3. Quit");
            System.out.println("\nEnter your choice: ");
            String userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    System.out.println("\n\n***Welcome to Admin page***");
                    System.out.println("\nEnter admin password to continue: ");
                    if (scanner.next().equals("admin")) {
                        System.out.println("Successfully Logged in");
                        System.out.println("1. Display Log FIle \n2. Quit");
                        String adminChoice = scanner.next();
                        switch (adminChoice) {
                            case "1":
                                try {
                                    FileReader fileReader = new FileReader("C:\\Users\\91892\\Documents\\UST\\UST Prograd Training\\Hackathon\\log.txt");
                                    BufferedReader bufReader = new BufferedReader(fileReader);
                                    String getLine;
                                    while ((getLine = bufReader.readLine()) != null) {
                                        System.out.println(getLine + "\n");
                                    }
                                    bufReader.close();
                                    fileReader.close();
                                } catch (IOException e) {
                                    System.out.println("\nERROR : File not Found !!!");
                                }
                                break;
                            case "2":
                                System.out.println("\n**Exiting Admin Page**");
                                break;
                            default:
                                System.out.println("Invalid Choice!!");
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid Password");
                    }
                    break;
                case "2":
                    fileWriter.write("Program Started\t");
                    String fromCurrencyChoice = "";
                    while (!fromCurrencyChoice.equals("Quit")) {
                        System.out.println("\n\n***Welcome to User page***");
                        System.out.println("\n\nINR - Indian Rupee \nUSD - US Dollar \nEUR - Euro \nAUD - Australian Dollar \nSAR - Saudi Riyal \nQuit");
                        System.out.println("\nFrom: ");
                        fromCurrencyChoice = scanner.next();
                        fileWriter.write("User selected "+fromCurrencyChoice+"\t");
                        switch (fromCurrencyChoice) {
                            case "INR":
                                double amount = -1;
                                do {
                                    System.out.println("\nEnter the amount to be converted: ");
                                    amount = scanner.nextDouble();
                                    if (amount < 0) System.out.println("Amount should be greater than zero");
                                } while (amount < 0);
                                fileWriter.write("User entered amount "+amount+"\t");
                                String toCurrencyChoice = "";
                                while (!toCurrencyChoice.equals("Quit")) {
                                    System.out.println("\n\nUSD - US Dollar \nEUR - Euro \nAUD - Australian Dollar \nSAR - Saudi Riyal \nQuit");
                                    System.out.println("\nTo: ");
                                    toCurrencyChoice = scanner.next();
                                    fileWriter.write("User selected "+toCurrencyChoice+"\t");
                                    switch (toCurrencyChoice) {
                                        case "USD":
                                            System.out.println(conversion.INRToUSD(amount));
                                            break;
                                        case "EUR":
                                            System.out.println(conversion.INRToEUR(amount));
                                            break;
                                        case "AUD":
                                            System.out.println(conversion.INRToAUD(amount));
                                            break;
                                        case "SAR":
                                            System.out.println(conversion.INRToSAR(amount));
                                            break;
                                        case "Quit":
                                            System.out.println("Exiting..");
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid Choice");
                                    }
                                }
                                break;
                            case "USD":
                                amount = -1;
                                do {
                                    System.out.println("\nEnter the amount to be converted: ");
                                    amount = scanner.nextDouble();
                                    if (amount < 0) System.out.println("Amount should be greater than zero");
                                } while (amount < 0);
                                fileWriter.write("User entered amount "+amount+"\t");
                                toCurrencyChoice="";
                                while (!toCurrencyChoice.equals("Quit")) {
                                    System.out.println("\n\nINR - Indian Rupee \nEUR - Euro \nAUD - Australian Dollar \nSAR - Saudi Riyal \nQuit");
                                    System.out.println("\nTo: ");
                                    toCurrencyChoice = scanner.next();
                                    fileWriter.write("User selected "+toCurrencyChoice+"\t");
                                    switch (toCurrencyChoice) {
                                        case "INR":
                                            System.out.println(conversion.USDToINR(amount));
                                            break;
                                        case "EUR":
                                            System.out.println(conversion.USDToEUR(amount));
                                            break;
                                        case "AUD":
                                            System.out.println(conversion.USDToAUD(amount));
                                            break;
                                        case "SAR":
                                            System.out.println(conversion.USDToSAR(amount));
                                            break;
                                        case "Quit":
                                            System.out.println("Exiting..");
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid Choice");
                                    }
                                }
                                break;
                            case "EUR":
                                amount=-1;
                                do {
                                    System.out.println("\nEnter the amount to be converted: ");
                                    amount = scanner.nextDouble();
                                    if (amount < 0) System.out.println("Amount should be greater than zero");
                                } while (amount < 0);
                                fileWriter.write("User entered amount "+amount+"\t");
                                toCurrencyChoice="";
                                while (!toCurrencyChoice.equals("Quit")) {
                                    System.out.println("\n\nINR - Indian Rupee \nUSD - US Dollar \nAUD - Australian Dollar \nSAR - Saudi Riyal \nQuit");
                                    System.out.println("\nTo: ");
                                    toCurrencyChoice = scanner.next();
                                    fileWriter.write("User selected "+toCurrencyChoice+"\t");
                                    switch (toCurrencyChoice) {
                                        case "INR":
                                            System.out.println(conversion.EURToINR(amount));
                                            break;
                                        case "USD":
                                            System.out.println(conversion.EURToUSD(amount));
                                            break;
                                        case "AUD":
                                            System.out.println(conversion.EURToAUD(amount));
                                            break;
                                        case "SAR":
                                            System.out.println(conversion.EURToSAR(amount));
                                            break;
                                        case "Quit":
                                            System.out.println("Exiting..");
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid Choice");
                                    }
                                }
                                break;
                            case "AUD":
                                amount=-1;
                                do {
                                    System.out.println("\nEnter the amount to be converted: ");
                                    amount = scanner.nextDouble();
                                    if (amount < 0) System.out.println("Amount should be greater than zero");
                                } while (amount < 0);
                                fileWriter.write("User entered amount "+amount+"\t");
                                toCurrencyChoice="";
                                while (!toCurrencyChoice.equals("Quit")) {
                                    System.out.println("\n\nINR - Indian Rupee \nUSD- US Dollar \nEUR - Euro \nSAR - Saudi Riyal \nQuit");
                                    System.out.println("\nTo: ");
                                    toCurrencyChoice = scanner.next();
                                    fileWriter.write("User selected "+toCurrencyChoice+"\t");
                                    switch (toCurrencyChoice) {
                                        case "INR":
                                            System.out.println(conversion.AUDToINR(amount));
                                            break;
                                        case "USD":
                                            System.out.println(conversion.AUDToUSD(amount));
                                            break;
                                        case "EUR":
                                            System.out.println(conversion.AUDToEUR(amount));
                                            break;
                                        case "SAR":
                                            System.out.println(conversion.AUDToSAR(amount));
                                            break;
                                        case "Quit":
                                            System.out.println("Exiting..");
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid Choice");
                                    }
                                }
                                break;
                            case "SAR":
                                amount=-1;
                                do {
                                    System.out.println("\nEnter the amount to be converted: ");
                                    amount = scanner.nextDouble();
                                    if (amount < 0) System.out.println("Amount should be greater than zero");
                                } while (amount < 0);
                                fileWriter.write("User entered amount "+amount+"\t");
                                toCurrencyChoice="";
                                while (!toCurrencyChoice.equals("Quit")) {
                                    System.out.println("\n\nINR - Indian Rupee \nUSD - US Dollar \nEUR - Euro \nAUD - Australian Dollar \nQuit");
                                    System.out.println("\nTo: ");
                                    toCurrencyChoice = scanner.next();
                                    fileWriter.write("User selected "+toCurrencyChoice+"\t");
                                    switch (toCurrencyChoice) {
                                        case "INR":
                                            System.out.println(conversion.SARToINR(amount));
                                            break;
                                        case "USD":
                                            System.out.println(conversion.SARToUSD(amount));
                                            break;
                                        case "EUR":
                                            System.out.println(conversion.SARToEUR(amount));
                                            break;
                                        case "AUD":
                                            System.out.println(conversion.SARToAUD(amount));
                                            break;
                                        case "Quit":
                                            System.out.println("Exiting..");
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid Choice");
                                    }
                                }
                                break;
                            case "Quit":
                                System.out.println("\n**Exiting User Page**");
                                fileWriter.write("Program Ended\n");
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid Choice");
                        }
                    }
                    break;
                case "3":
                    System.out.println("Thankyou!!");
                    fileWriter.write("Program Ended.\n");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Choice");
            }
            fileWriter.close();
        }
        catch (IllegalArgumentException | IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}
class IllegalArgumentException extends Exception{
    public IllegalArgumentException(String str){
        super(str);
    }
}
