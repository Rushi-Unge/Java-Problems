import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter YOur Command: ");
            String command= input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
