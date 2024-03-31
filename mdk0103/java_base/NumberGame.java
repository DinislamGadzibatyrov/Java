package JavaBase;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 9) + 1;
        int attempts = 3;

        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 9. У вас есть 3 попытки.");

        while (attempts > 0) {
            System.out.print("Введите вашу догадку: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }

            attempts--;
            if (attempts > 0) {
                System.out.println("У вас осталось " + attempts + " попыток.");
            } else {
                System.out.println("К сожалению, вы не угадали. Загаданное число: " + secretNumber);
            }
        }
    }
}