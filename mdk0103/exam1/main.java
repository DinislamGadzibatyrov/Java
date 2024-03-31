package exam1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] expenses = new double[30];
        
        while (true) {
            System.out.println("Меню: ");
              System.out.println("1 - Ввести расходы за определенный день");
              System.out.println("2 - Траты за месяц");
              System.out.println("3 - Самая большая сумма расхода за месяц");
              System.out.println("0 - Выход");
            System.out.println("Выбирите пункт меню: ");
              int choice = scanner.nextInt();
              switch (choice) {
                  case 1: 
                      System.out.println("Введите день (от 1 до 30): ");
                        int day = scanner.nextInt();
              System.out.println("Введите сумму трат за день: ");
              double amount = scanner.nextDouble();
                  expenses[day - 1] = amount;
                  break;
                  case 2:
                      System.out.println("Траты за месяц: ");
                              for (int i = 0; i < expenses.length; i++) {
                                  System.out.println((i + 1) + " день - " + expenses[i] + " руб");
                              }
                  break;
                  case 3: 
                      double maxExpense = 0;
                      int maxDay = 0;
                      for (int i = 0; i < expenses.length; i++) {
                          if (expenses[i] > maxExpense) {
                              maxExpense = expenses[i];
                              maxDay = i + 1;
                          }
                      }
                  System.out.println("Самая большая сумма расхода за месяц: ");
                      System.out.println(maxDay + " день - " + maxExpense + " руб");
                      break;
                  case 0: 
                      System.out.println("До свидания!");
                      System.exit(0);
                  default:
                      System.out.println("Неверный выбор. Попробуйте снова.");
              }
        }
    }
}
        