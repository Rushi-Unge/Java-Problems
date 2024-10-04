import java.util.Scanner;

public class ElementOccurrence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program to calculate number of occurrence of a element in the array");
        System.out.println("Enter the number of elements you want in the array| ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Initialize the given array");
        for (int i=0; i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Enter a number you want see the occurrence in the array");
        int num= input.nextInt();
        int count=0;
        for(int i=0;i< arr.length;i++){
           if(num==arr[i]){
               count++;
           }
        }
        System.out.println("The number of occurrence of "+num+" is "+ count);

    }

}
