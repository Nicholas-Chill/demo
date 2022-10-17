import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int random_num = rand.nextInt(100);
        int lives = 8;
        int guess_num = 1;
        int num_guessed;

        System.out.println("Try to guess the number between 1-100 within 8 tries");

        do {
            System.out.println("Lives: " + lives);
            System.out.print("Guess " + guess_num + ": ");
            String guess = scan.nextLine();
            num_guessed = Integer.parseInt(guess);
            guess_num++;

            if(num_guessed > random_num && lives != 0){
                System.out.println("The correct number is less than " + num_guessed);
                lives--;
            } else if(num_guessed < random_num && lives != 0) {
                System.out.println("The correct number is greater than " + num_guessed);
                lives--;
            } else if (lives == 0) {
                System.out.println("Sorry, you ran out of lives. The correct number was "
                        + random_num + " Better luck next time!");
                break;
            }
        } while(num_guessed != random_num);

        if(num_guessed == random_num) {
            System.out.println("Congratulations! You guessed the correct number!");
        }
    }
}