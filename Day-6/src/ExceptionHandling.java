import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch (InputMismatchException ie){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
