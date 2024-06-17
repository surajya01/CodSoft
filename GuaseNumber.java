import java.util.Scanner;

class Task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int guess = (int)(Math.random() * 100) + 1;
        int Guesses = 3;

        do {
            System.out.println("Guess the number:");
            int num = s.nextInt();
            Guesses--;


            if (num == guess) {
                System.out.println("Wow! It's Right. You guessed the right number.");
                break;
            } else if (Guesses == 0) {
                System.out.println("Oops! Your Time's up. You ran out of guesses.");
                break;
            } else if (num > guess) {
                System.out.println("Not correct! Guess a smaller number.");
            } else {
                System.out.println("Not correct! Guess a larger number.");
            }
        } while (true);

        s.close();
    }
}
