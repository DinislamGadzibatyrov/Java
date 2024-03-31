package JavaBase;

import java.util.Random;

public class Weekly {
    public static void main(String[] args) {
        int daysInWeek = 7;
        double[] expenses = new double[daysInWeek];
        Random random = new Random();

        for (int day = 0; day < daysInWeek; day++) {
            expenses[day] = random.nextDouble() * 1000.0;
        }

        System.out.println("Траты за неделю:");
        for (int day = 0; day < daysInWeek; day++) {
            System.out.println("День " + (day + 1) + ": " + expenses[day] + " руб");
        }

        double totalExpenses = 0.0;
        for (double expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за неделю: " + totalExpenses + " руб");
    }
}