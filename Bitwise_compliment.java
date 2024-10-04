import java.util.Scanner;

public class Bitwise_compliment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bitwise Not/compliment operator");
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int result =~n;
        //Integer has 4 byte therefore the answer getting wrong
        System.out.println("result is : "+ result);
    }
}
