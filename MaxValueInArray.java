

public class MaxValueInArray {
    public static void main(String[] args) {
        System.out.println("The Maximum Value in an Array");;
        int[] arr=utilityArray.inputArray();
        int max=Integer.MIN_VALUE;
        for (int num: arr){
            if (max<num){
                max=num;
            }
        }
        System.out.println("Maximum number is : "+max);
    }
}
