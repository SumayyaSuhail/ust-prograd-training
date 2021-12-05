import java.util.Scanner;

public class ValidUser {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName= scanner.nextLine();
        System.out.println("Enter your password: ");
        String passWord = scanner.nextLine();

        ValidUserName validUserName = new ValidUserName();
        ValidPassword validPassword = new ValidPassword();

        try{
            validUserName.isValidUser(userName);
            validPassword.isValidPassword(passWord,userName);
        }
        catch (ValidUserNameException vn){
            System.out.println(vn.printMessage());
        }
        catch (ValidPasswordException vp){
            System.out.println(vp.printPassword());
        }
    }
}
class ValidPasswordException extends Exception{
    int passwordCondition=0;
    public ValidPasswordException(int invalidPassword){
        super("Invalid Password");
        passwordCondition=invalidPassword;
    }
    public String printPassword(){
        switch (passwordCondition){
            case 1: return ("A password must have 8 to 256 characters");
            case 2: return ("There cannot be any types of parenthesis or whitespaces in a valid password");
            case 3: return("A password cannot contain or be the same as its associated username");
            default: return("No Exception");
        }
    }
}
class ValidPassword{
    public void isValidPassword(String password, String username) throws ValidPasswordException{
        if (password.length()<8 || password.length()>256){
            throw new ValidPasswordException(1);
        }
        else if (password.contains(" ")||password.contains("{")||password.contains("}")||password.contains("(")||password.contains(")")||password.contains("[")||password.contains("]")){
            throw new ValidPasswordException(2);
        }
        else if(password.equals(username)){
            throw new ValidPasswordException(3);
        }
    }
}
class ValidUserNameException extends Exception{
    int usernameCondition=0;
    public ValidUserNameException(int invalidUsername){
        super("Invalid Username");
        usernameCondition=invalidUsername;
    }
    public String printMessage(){
        switch (usernameCondition){
            case 1: return ("A username must have 6 to 15 characters");
            case 2: return ("A username must start with an uppercase English Alphabet A to Z");
            case 3: return("There cannot be any types of parenthesis or whitespaces in a valid username");
            default: return("No Exception");
        }
    }
}
class ValidUserName{
    public void isValidUser(String username) throws ValidUserNameException{
        if (username.length()<6 || username.length()>15){
            throw new ValidUserNameException(1);
        }
        else if (username.charAt(0)>'a' && username.charAt(0)<'z'){
            throw new ValidUserNameException(2);
        }
        else if (username.contains(" ")||username.contains("{")||username.contains("}")||username.contains("(")||username.contains(")")||username.contains("[")||username.contains("]")){
            throw new ValidUserNameException(3);
        }
    }
}