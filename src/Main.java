import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {

        System.out.println("Point Tests---------------------------------------");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());
        System.out.println("---------------------------------------");

        System.out.println("Player Tests---------------------------------------");

        Player player1 = new Player("joe", 100, Weapon.DAGGER);
        Player player2 = new Player("jimy", 101, Weapon.BOW);
        Player player3 = new Player("tom", -1, Weapon.SWORD);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        player1.loseHealth(100);
        System.out.println(player1);

        player1.restoreHealth(1500);
        System.out.println(player1);


        System.out.println("---------------------------------------");
    }
}