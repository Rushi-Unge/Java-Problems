import java.util.Scanner;


public class Welcome {
    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        Scanner input=new Scanner(System.in);
        String Name= input.nextLine();
        System.out.println("Welcome "+ Name + " to KG Coding");

        int a= input.nextInt();
        int b= input.nextInt();
        int sum=a+b;
        System.out.println(sum);




    }
}
