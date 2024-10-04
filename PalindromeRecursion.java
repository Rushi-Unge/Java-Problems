import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println("String is Palindrome or not using recursion ");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        String str=input.next();
        System.out.println("Your string is "+
                ((isPalindrome(str)?"Palindrome":
                        "Not Palindrome")));

    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}

