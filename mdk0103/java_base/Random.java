package JavaBase;

public class Random {
    public static void main(String[] args) {
        int[] array = new int[50];

        // Заполнение массива случайными числами от 1 до 50
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        // Поиск максимального и минимального элементов
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        // Вывод результатов
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Среднее арифметическое: " + (double) sum / array.length);
    }
}