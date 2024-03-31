package JavaBase;
import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем значения из консоли
        System.out.print("Введите вашу зарплату: ");
        double salary = scanner.nextDouble();
        System.out.print("Введите планируемые затраты на транспорт: ");
        double transportationExpenses = scanner.nextDouble();
        System.out.print("Введите планируемые затраты на еду: ");
        double foodExpenses = scanner.nextDouble();
        System.out.print("Введите сумму возможных сбережений: ");
        double savings = scanner.nextDouble();

        // Вызываем метод для анализа бюджета
        analyzeBudget(salary, transportationExpenses, foodExpenses, savings);
    }

    // Метод для анализа бюджета
    public static void analyzeBudget(double salary, double transportationExpenses,
                                     double foodExpenses, double savings) {
        double totalExpenses = transportationExpenses + foodExpenses;
        double surplus = salary - totalExpenses;

        if (surplus > 0) {
            System.out.println("Излишек средств: " + surplus + " руб.");
            System.out.println("Рекомендация: рассмотрите возможность увеличения сбережений.");
        } else if (surplus < 0) {
            System.out.println("Недостаток средств: " + Math.abs(surplus) + " руб.");
            System.out.println("Рекомендация: пересмотрите свои затраты и поищите способы сэкономить.");
        } else {
            System.out.println("Бюджет сбалансирован. Нет излишков и недостатков.");
        }
    }
}