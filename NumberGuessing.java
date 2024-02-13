import java.util.*;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random no = new Random();

        int TotalAttemps = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("****NUMBER GUESSING GAME!****");
        System.out.println("Guess the number in 10 trials.\nNumber is between 1 to 100");
        do {
            int num = no.nextInt(100) + 1;
            int attemp = 0;
            while (attemp <= TotalAttemps) {
                System.out.println("Guess the number: ");
                int guess = sc.nextInt();
                attemp++;

                if (guess == num) {
                    System.out.println("Congratulation! Your guess is correct.");
                    System.out.println("The number is: " + num);
                    score += TotalAttemps - (attemp - 1);
                    break;
                }

                else if (num < guess) {
                    System.out.println("The number is too high.Try again.");
                } else if (num > guess) {
                    System.out.println("The number is too low.Try again.");
                }
            }

            if (attemp == 1) {
                System.out.println("You guessed the number in" + attemp + "tries.\nThat was ur luck!");
            } else if (attemp > 1 && attemp <= 4) {
                System.out.println("You guessed the number in" + attemp + "tries.\nThat was amazing!");
            } else if (attemp > 4 && attemp <= 8) {
                System.out.println("You guessed the number in" + attemp + "tries.\nThat was good!");
            } else {
                System.out.println("You guessed the number in" + attemp + "tries.\nThat was not your game!");
            }

            if (attemp == TotalAttemps) {
                System.out.println("You have exhausted 10 trials.");
                System.out.println("The number was: " + num);
                break;
            }

            rounds++;
            System.out.println("Do you want to play again?(YES/NO): ");
        } while (sc.next().equalsIgnoreCase("YES"));
        System.out.println("Rounds played: " + rounds);
        System.out.println("Total score: " + score);
    }
}