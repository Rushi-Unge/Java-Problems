import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of elements you want in the array");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Initialize the given array");
        for (int i=0; i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        boolean isSorted=true;

        for (int i=1; i<arr.length;i++){
            if (arr[i]< arr[i-1]){
                    isSorted=false;
            }

        }
        if (isSorted){
            System.out.println("Thw given array is sorted");
        }else{
            System.out.println("The given array is not sorted");
        }


    }
}
