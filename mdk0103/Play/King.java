package Play;

// Класс для короля
class King {
    private int health;
    private int gold;
    private Unit knights;
    private Unit infantry;

    public King() {
        this.health = 100;
        this.gold = 1000;
        this.knights = new Unit("Knight", 100, 20);
        this.infantry = new Unit("Infantry", 80, 15);
    }

    public void attackEnemy(Enemy enemy) {
        int totalDamage = knights.getAttack() + infantry.getAttack();
        enemy.getDamage(totalDamage);
        gold += enemy.getCoins();
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }
}
