//09-02-2026
//creating and sorting lists with comparable and comparator
//CREATE 6 PLAYERS AND SORT THEM BY POINTS USING THE COMPARABLE, THEN SORTING THEM WITH THE COMPARATOR BY NAME AND
//BY LEVEL
package p09_lists;

import p09_lists.domain.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("Garcia",50,100));
        players.add(new Player("Ana",51,90));
        players.add(new Player("Rafael",52,93));
        players.add(new Player("Jhonnatan",23,40));
        players.add(new Player("Davi",53,82));
        players.add(new Player("Roberto",30,15));

        Collections.sort(players); //use comparable and the method on the class Player
        System.out.println("Ordered by points");
        for (Player p : players) {
            System.out.println(p);
        }

        players.sort(new PlayersByName()); // use the comparator class
        System.out.println("\nOrdered by name");
        for (Player p : players) {
            System.out.println(p);
        }

        players.sort(new PlayersByLevel());
        System.out.println("\nOrdered by level");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}

class PlayersByName implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class PlayersByLevel implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o2.getLevel(), o1.getLevel());
    }
}
