public class OddAndEvenElement {
    public static void main(String[] args) {
        int[] arr = utilityArray.inputArray();
        int oddNum = 0;
        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
            System.out.println("Even Element in the given array is " + evenNum);
            System.out.println("Odd Element in the given array is " + oddNum);
        }
    }
