import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Greatest of the three numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        System.out.println("Enter the number num1 ");
        System.out.println("Enter the number num2 ");
        System.out.println("Enter the number num3 ");

        if (num1 >num2 && num1>num3){
            System.out.println("The Greatest number is num1 "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The Greatest number is num2 "+num2);
        }
        else {

            System.out.println("The Greatest number is num3 "+num3);
        }



    }
    }
