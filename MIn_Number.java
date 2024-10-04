import java.util.Scanner;

public class MIn_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num1= input.nextFloat();
        float num2= input.nextFloat();
        float minNumber=num1<num2?num1:num2;
        System.out.println("Minimum number is "+minNumber);

        String result =minNumber%2 == 0?"Even":"Odd";
        System.out.println("The number is "+result);

        float resul= minNumber>=0?minNumber:-minNumber;
        System.out.println("Absolute number of the given number "+resul);
    }


}
