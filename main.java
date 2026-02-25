import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("🎮 Number Battle ойынына қош келдің!");
        System.out.println("1 мен 100 арасындағы санды тап!");

        while (guess != number) {
            System.out.print("Санды енгіз: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("⬆ Үлкенірек сан!");
            } else if (guess > number) {
                System.out.println("⬇ Кішілеу сан!");
            } else {
                System.out.println("🎉 Дұрыс! Сен " + attempts + " попыткада таптың!");
            }
        }

        scanner.close();
    }
}
