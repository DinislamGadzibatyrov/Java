package JavaBase;

import java.time.LocalTime;

public class Robot {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if (hour >= 4 && hour < 12) {
            System.out.println("Доброе утро! Рад познакомиться.");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день! Как я могу помочь?");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер! Чем могу помочь?");
        } else {
            System.out.println("Доброй ночи! Что вас интересует?");
        }
    }
}