import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Showing Bitwise XOR Operator ");
        System.out.println("Enter the fist number");
        int n1= sc.nextInt();
        System.out.println("Enter the second number");
        int n2= sc.nextInt();
        int result=n1^n2;
        System.out.println("Result is: "+result);
    }
}
