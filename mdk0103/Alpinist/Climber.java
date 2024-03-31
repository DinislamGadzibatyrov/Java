package Alpins;

// Класс Альпинист
class Climber {
    private String name;
    private int age;
    private String address;

    public Climber(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Геттеры и сеттеры (по желанию)

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
