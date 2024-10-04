public class reverseArray  {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr=utilityArray.inputArray();
        reverse(numArr);
        System.out.println("Your reversed array is ");
        for (int i=0;i<numArr.length;i++){
            System.out.print(numArr[i]+"\t");
        }

    }
    public static void reverse(int[] arr){
        int i=0;
        while (i<arr.length/2){
            int swap=arr[i];
            arr[i]=arr[(arr.length -1)-i];
            arr[(arr.length -1)-i]=swap;
            i++;
        }
    }
}
