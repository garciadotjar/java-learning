//09-03-2026
//Using Set, NavigableSet, TreeSet etc.

package p10_set;

import p10_set.domain.Player;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Player> players = new TreeSet<>();
        players.add(new Player("Garcia",50,100));
        players.add(new Player("Ana",51,90));
        players.add(new Player("Rafael",52,93));
        players.add(new Player("Jhonnatan",23,40));
        players.add(new Player("Davi",53,82));
        players.add(new Player("Roberto",30,15));


        System.out.println("Ordered by points automatically because is using TreeSet");
        for (Player p : players) {
            System.out.println(p);
        }

        System.out.println("\n--------------------");
        System.out.println("Player with more points: " + players.first());
        System.out.println("Player with less points: " + players.last());
        System.out.println("Nearest player with more than 40 points: "+ players.lower(new Player(null,40,0)));
        System.out.println("Nearest player with less than 40 points: "+ players.higher(new Player(null,40,0)));
    }
}
