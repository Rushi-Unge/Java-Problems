import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR operator \n");
        System.out.println("Please Enter the first number");
        int n1= input.nextInt();
        System.out.println("Now, enter the second number ");
        int n2= input.nextInt();
        int result=n1 | n2;
        System.out.println("The Result is: "+ result);
    }
}
