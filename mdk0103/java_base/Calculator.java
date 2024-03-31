package JavaBase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стартовый баланс счета (рубли): ");
        double initialBalance = scanner.nextDouble();
        double targetBalance = 1_000_000.0; // Целевая сумма (миллион рублей)
        double annualInterestRate = 0.10; // Годовая процентная ставка (10%)

        int years = 0;
        while (initialBalance < targetBalance) {
            initialBalance += initialBalance * annualInterestRate;
            years++;
        }

        System.out.println("Через " + years + " лет на счету будет " + targetBalance + " рублей.");
    }
}