public class OnlyEven {
    public static void main(String[] args) {
        System.out.println("Print Even number");
        int[] arr=utilityArray.inputArray();

        for(int num:arr){
            if(num%2!=0){
                continue;
            }
            System.out.println(num);
        }
    }
}
