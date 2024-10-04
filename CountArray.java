import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        System.out.println("Occurrence of a element in an array");
        Scanner input =new Scanner(System.in);
        int[] arr=utilityArray.inputArray();
        System.out.println("Enter number to find the occurrence of it ");
        int num= input.nextInt();
        int count=0;
        for (int i:arr)
            if (i == num) {
                count++;
            }
        System.out.println("The Occurrence of "+num+" is "+ count);
    }
}
