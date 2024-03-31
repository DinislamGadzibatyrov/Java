package Play;

// Класс для врагов
class Enemy {
    private int type;
    private int damage;
    private int coins;

    public Enemy(int type) {
        this.type = type;
        if (type == 1) {
            this.damage = 5;
            this.coins = 0;
        } else if (type == 2) {
            this.damage = 10;
            this.coins = 50;
        } else if (type == 3) {
            this.damage = 50;
            this.coins = 100;
        }
    }

    public int getDamage(int totalDamage) {
        return damage;
    }

    public int getCoins() {
        return coins;
    }
}
