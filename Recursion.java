import java.util.Scanner;

public class Recursion {
    //self calling function
    //base case : essential to stop and prevent infinite loop
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to factorial generator\n");
        System.out.println("Please enter your number ");
        int num= input.nextInt();
        long fact=factorial(num);

        System.out.println("Factorial of your number is: "+fact);
    }
    public static long factorial(int num){
        if(num==1){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static long factorialIteration(int num){
        long result =1;
        for (int i=1;i<=num;i++){
            result *= i;
        }
        return result;

    }
}
