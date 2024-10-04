
import java.util.Scanner;
public class NumberGuessingGame {
    int random;
    NumberGuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     *  the number that player guessed
     *   Negative if the guessed number is smaller
     *   0 if the guessed number is correct
     *   positive if the guessed number is greater
     */
    int guess(int guessNumber){
        return guessNumber - random;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        NumberGuessingGame game=new NumberGuessingGame();
        System.out.println("Welcome to the guessing game, guess the number between 1 to 100");
        int guess;
        int result;

        do {
            System.out.println("Guess the Number");
            guess=input.nextInt();
            result = game.guess(guess);
            if(result==0){
                System.out.println("Congrats, your guess is correct");
            }else if(result < 0) {
                System.out.println("Please guess a greater number");
            }else {
                System.out.println("Please guess a smaller number");
            }
        }while(result != 0);
        System.out.println("You Guessed the Correct Number");

    }
}
