import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program to find the minimum and maximum element in the array");
        System.out.println("Enter the number of elements you want in the array| ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Initialize the given array");
        for (int i=0; i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Calculate the maximum number in the array");
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max number in the array is "+max);

        System.out.println("Calculate the minimum number in the array");
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The max number in the array is "+min);
    }
}
