package Alpins;


public class Main {
    public static void main(String[] args) {
        // Создаем горы
        Mountain everest = new Mountain("Эверест", "Непал", 8848.86);
        Mountain kilimanjaro = new Mountain("Килиманджаро", "Танзания", 5895.0);
        Mountain denali = new Mountain("Денали", "США", 6190.5);

        // Создаем группы для восхождения
        ClimbingGroup group1 = new ClimbingGroup(everest);
        ClimbingGroup group2 = new ClimbingGroup(kilimanjaro);
        ClimbingGroup group3 = new ClimbingGroup(denali);

        // Добавляем альпинистов в группу 1 (набор закрыт)
        group1.addClimber(new Climber("Иван", 30, "Москва"));
        group1.addClimber(new Climber("Елена", 28, "Санкт-Петербург"));
        group1.addClimber(new Climber("Алексей", 35, "Новосибирск"));

        // Выводим информацию о группах
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }
}
