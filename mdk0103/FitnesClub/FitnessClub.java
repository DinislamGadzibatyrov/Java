package FitnesClub;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class FitnessClub {
    private List<Abonement> gymRegistrations = new ArrayList<>();
    private List<Abonement> poolRegistrations = new ArrayList<>();
    private List<Abonement> groupClassRegistrations = new ArrayList<>();
    public static final int MAX_CAPACITY = 20;
    private LocalTime currentTime;


    public String canEnter(Abonement abonement, Area area) {
        LocalDate currentDate = LocalDate.now();
        if (abonement.getExpirationDate().isBefore(currentDate)) {
            return "Абонемент просрочен.";
        }
        if (!abonement.isAccessAllowed(area, currentDate)) {
            return "Доступ в зону " + area + " не разрешен по вашему абонементу.";
        }
        if (abonement.getType() == AbonementType.SINGLE && (currentTime.isBefore(LocalTime.of(8, 0)) || currentTime.isAfter(LocalTime.of(22, 0)))) {
            return "Доступ в бассейн и тренажёрный зал по разовому абонементу с 8 до 22 часов.";
        }
        if (abonement.getType() == AbonementType.DAY && (currentTime.isBefore(LocalTime.of(8, 0)) || currentTime.isAfter(LocalTime.of(16, 0)))) {
            return "Доступ в тренажёрный зал и на групповые занятия по дневному абонементу с 8 до 16 часов.";
        }
        if (abonement.getType() == AbonementType.FULL && (currentTime.isBefore(LocalTime.of(8, 0)) || currentTime.isAfter(LocalTime.of(22, 0)))) {
            return "Доступ ко всем зонам по полному абонементу с 8 до 22 часов.";
        }
        List<Abonement> registrations = getRegistrationsForArea(area);
        if (registrations.size() >= MAX_CAPACITY) {
            return "В зоне " + area + " нет свободных мест.";
        }
        registrations.add(abonement);
        return "Доступ разрешен.";
    }


    public int getCurrentCount(Area area) {
        Random random = new Random();
        return random.nextInt(MAX_CAPACITY + 1);
    }


    private List<Abonement> getRegistrationsForArea(Area area) {
        switch (area) {
            case GYM:
                return gymRegistrations;
            case POOL:
                return poolRegistrations;
            case GROUP_CLASSES:
                return groupClassRegistrations;
            default:
                return new ArrayList<>();
        }
    }


    public void randomizeAreaCounts() {
        Random random = new Random();
        gymRegistrations = getRandomPeopleCount(random);
        poolRegistrations = getRandomPeopleCount(random);
        groupClassRegistrations = getRandomPeopleCount(random);
    }

    private List<Abonement> getRandomPeopleCount(Random random) {
        List<Abonement> randomList = new ArrayList<>();
        int count = random.nextInt(MAX_CAPACITY + 1); // Случайное число от 0 до MAX_CAPACITY
        for (int i = 0; i < count; i++) {
            randomList.add(new Abonement()); // Добавляем абонементы без конкретных данных
        }
        return randomList;
    }
}



