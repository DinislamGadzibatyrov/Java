package Play;

// Класс Play с точкой входа
public class Play {
    public static void main(String[] args) {
        King king = new King();
        Enemy enemy1 = new Enemy(1);
        Enemy enemy2 = new Enemy(2);
        Enemy enemy3 = new Enemy(3);

        king.attackEnemy(enemy1);
        king.attackEnemy(enemy2);
        king.attackEnemy(enemy3);

        System.out.println("King's health: " + king.getHealth());
        System.out.println("King's gold: " + king.getGold());
    }
}