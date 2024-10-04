import java.util.Scanner;

public class EvenOddUsing_Bitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Even Odd Checker Using Bitwise Operator");
        System.out.println("Please Enter a number");
        int num= input.nextInt();
        if((num & 1) ==1){
            System.out.println("The given number is odd");
        }else {
            System.out.println("The given number is even");
        }

    }
}
