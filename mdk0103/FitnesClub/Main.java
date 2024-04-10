package FitnesClub;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessClub club = new FitnessClub();

        System.out.println("Добро пожаловать в фитнес-клуб!");
        System.out.println("Введите ваше имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите вашу фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите ваш год рождения:");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера сканера

        System.out.println("Выберите тип абонемента: 1 - Разовый, 2 - Дневной, 3 - Полный");
        int typeChoice = scanner.nextInt();
        AbonementType type = null;
        switch (typeChoice) {
            case 1:
                type = AbonementType.SINGLE;
                break;
            case 2:
                type = AbonementType.DAYTIME;
                break;
            case 3:
                type = AbonementType.FULL;
                break;
            default:
                System.out.println("Неверный выбор типа абонемента.");
                scanner.close();
                return;
        }
        LocalDate expirationDate = LocalDate.now();
        if (type != AbonementType.SINGLE) {
            System.out.println("Введите количество дней действия абонемента:");
            int duration = scanner.nextInt();
            expirationDate = LocalDate.now().plusDays(duration);
        }

        scanner.nextLine(); // Очистка буфера сканера
        System.out.println("Выберите зону для регистрации: 1. Тренажерный зал 2. Бассейн 3. Групповые занятия");
        int areaChoice = scanner.nextInt();
        Area area = null;
        switch (areaChoice) {
            case 1:
                area = Area.GYM;
                break;
            case 2:
                area = Area.POOL;
                break;
            case 3:
                area = Area.GROUP_CLASSES;
                break;
            default:
                System.out.println("Неверный выбор зоны.");
                scanner.close();
                return;
        }

        Abonement abonement = new Abonement(LocalDate.now(), expirationDate, firstName, lastName, birthYear, type);
        String entryResult = club.canEnter(abonement, area);
        System.out.println(entryResult);

        // Цикл для выбора зоны после регистрации
        boolean continueVisiting = true;
        while (continueVisiting) {
            System.out.println("Выберите зону для посещения: 1. Тренажерный зал 2. Бассейн 3. Групповые занятия или введите 0 для выхода:");
            areaChoice = scanner.nextInt();
            if (areaChoice == 0) {
                continueVisiting = false;
                break;
            }

            switch (areaChoice) {
                case 1:
                    area = Area.GYM;
                    break;
                case 2:
                    area = Area.POOL;
                    break;
                case 3:
                    area = Area.GROUP_CLASSES;
                    break;
                default:
                    System.out.println("Неверный выбор зоны.");
                    continue;
            }

            entryResult = club.canEnter(abonement, area);
            int currentCount = club.getCurrentCount(area);
            boolean hasSpace = currentCount < FitnessClub.MAX_CAPACITY;

            System.out.println("В зоне " + area + " сейчас занимаются " + currentCount + " человек.");
            System.out.println("Доступ в зону: " + (hasSpace ? "Разрешен доступ по абонименту" : "Абонимент зарегистрирован в другой зоне"));
            System.out.println(entryResult);
        }

        scanner.close();
        }
    }