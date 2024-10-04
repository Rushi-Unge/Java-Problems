import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sum and Average of the given array");
        System.out.println("Enter the array index number");
       int n= input.nextInt();

       if (n<=0){
           System.out.println("The number of elements should be greater than 0.");
           return;
       }
        int[] arr;
        arr = new int[n];
        System.out.println("Enter the Elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Calculate the sum of the elements in the array");
        int sum=0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all the elements in the array is "+sum);

        System.out.println("Calculate the Average");
        int average=sum/n;
        System.out.println("The Average of the elements in the array is "+average);
    }

}
