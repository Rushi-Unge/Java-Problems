import java.util.Scanner;

public class Score_Ternary {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Score\n ");
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks= input.nextInt();
        String category=marks > 80?"High":(marks>50? "Moderate":"Low");
        System.out.println("Your Category is :"+category);
    }
}
