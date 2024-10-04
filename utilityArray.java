import java.util.Scanner;

public class utilityArray {
    public static void main(String[] args) {


    }
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the Array  ");
        int size= input.nextInt();
        int[] ArrayElements= new int[size];
        int i=0;
        while(i < size){
            System.out.print("Enter the element no  "+ (i+1)+":");
            ArrayElements[i]= input.nextInt();
            i++;
        }
        return ArrayElements;

    }
        public static int[] DisplayArray(int[] arr){
            int i=0;
            while(i< arr.length){
                System.out.print(arr[i]+"\t");
                i++;
            }
            return arr;
        }
}
