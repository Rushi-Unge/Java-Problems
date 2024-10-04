import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={3,4,5,6,23,67,34,75,23,53,12,8,9,33};
        System.out.println("Welcome to Array Search");
        System.out.println("Enter the number you want to search: ");
        int num= input.nextInt();
        boolean isFound = isFound(arr,num);
        if (isFound){
            System.out.println("Your number was found in the array");
        }else{
            System.out.println("Your number was not found in the array");
        }

    }

    public static boolean isFound(int[] arr,int num){
        int index = 0;
        while (index < arr.length){
           if (arr[index] == num){
               return true;
           }
            index++;

        }
        return false;
    }

}
