import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random = (int)(Math.random() * 100);

        System.out.println("Guess a magic number between 0 and 100");
        while (true) {
            System.out.print("Enter your guess: ");
            int number = input.nextInt();

            if (number == random) {
                System.out.println("Yes the number is " + random);
                break;
            } else if (number < random) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
        }
    }
}