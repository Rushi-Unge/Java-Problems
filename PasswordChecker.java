import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Password checker using do while loop");
        Scanner input=new Scanner(System.in);

        boolean isValid;
        String password;
        do {
            System.out.print("please enter your password  ");
            password=input.next();
        }while (!isValidPassword(password));
        System.out.println("Thank for entering a valid password");
    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
