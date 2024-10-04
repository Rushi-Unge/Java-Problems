import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Program to determine given year is a leap year or not");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = input.nextInt();

        if (Year%400==0 && Year%100!=0){
            System.out.println("The year "+ Year +"is a leap year.");
        }else {
            System.out.println("The year "+ Year+"is not a leap year");
        }
    }
}
