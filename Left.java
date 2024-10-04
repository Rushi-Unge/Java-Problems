import java.util.Scanner;

public class Left{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Left Shift Operator");
        System.out.println("Enter a number to be left shifted");
        int n1= sc.nextInt();
        int result = n1<<1;
        System.out.println("the result is: "+ result);

    }
}
