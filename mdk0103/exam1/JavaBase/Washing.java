package JavaBase;

import java.util.Scanner;

public class Washing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тарелок: ");
        int plates = scanner.nextInt();
        System.out.print("Введите количество моющего средства: ");
        double detergent = scanner.nextDouble();

        for (int plate = 1; plate <= plates; plate++) {
            System.out.println("Помыта " + plate + " тарелка");
            detergent -= 0.5;
            System.out.println("Осталось моющего средства: " + detergent);
        }
    }
}