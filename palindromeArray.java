public class palindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker\n");
        int[] numArr=utilityArray.inputArray();
        boolean isPlain=isPalindrome(numArr);
        if(isPlain){
            System.out.println("Your array is Palindrome");
        }else{
            System.out.println("Your array is not Palindrome");
        }

    }
    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while (i<numArr.length/2){
            if (numArr[i] != numArr[numArr.length -1 -i]){
                return false;
            }
            i++;
        }
        return true;

    }
}
