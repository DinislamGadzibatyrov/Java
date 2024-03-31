package JavaBase;

import java.util.Scanner;

public class CurrencyWallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Исходные суммы в базовых валютах
        double dollars = 1000.0;
        double euros = 800.0;
        double yen = 50000.0;
        double rubles = 70000.0;

        System.out.println("Добро пожаловать в валютный кошелек для путешествий!");
        System.out.print("Куда вы планируете отправиться (Швеция или Китай)? ");
        String destination = scanner.nextLine();

        if (destination.equalsIgnoreCase("Швеция")) {
            // При поездке в Швецию меняем евро на шведские кроны
            euros -= 200.0;
            double sek = 2000.0; // Сумма в шведских кронах
            System.out.println("Вы обменяли 200 евро на " + sek + " шведских крон.");
        } else if (destination.equalsIgnoreCase("Китай")) {
            // При поездке в Китай меняем иены на юани
            yen -= 10000.0;
            double cny = 700.0; // Сумма в юанях
            System.out.println("Вы обменяли 10000 иен на " + cny + " юаней.");
        } else {
            System.out.println("Извините, неправильный выбор. Пожалуйста, выберите Швецию или Китай.");
        }

        // Выводим остаток в базовых валютах
        System.out.println("Остаток в кошельке:");
        System.out.println("Доллары: " + dollars);
        System.out.println("Евро: " + euros);
        System.out.println("Иены: " + yen);
        System.out.println("Рубли: " + rubles);
    }
}