package Alpins;

// Класс Гора
class Mountain {
    private String name;
    private String country;
    private double height;

    public Mountain(String name, String country, double height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    // Геттеры и сеттеры (по желанию)

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
