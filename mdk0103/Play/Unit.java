package Play;

// Класс для юнитов (рыцарей и пехотинцев)
class Unit {
    private String name;
    private int health;
    private int attack;

    public Unit(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
}
