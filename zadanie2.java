import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner volodia = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean kasik = false;

        System.out.println("угадай число от 1 до 100");

        while (!kasik && attempts < 10) {
            System.out.print("введи число: ");
            int guess = volodia.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("поздравляю! ты угадал число!");
                kasik = true;
            } else if (guess < secretNumber) {
                System.out.println("загаданное число больше");
            } else {
                System.out.println("загаданное число меньше");
            }
        }

        if (!kasik) {
            System.out.println("ты не угадал число: " + secretNumber);
        }

    }
}
