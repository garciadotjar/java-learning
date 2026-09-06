//09-06-2026
//hashmap
package p11_binarySearch;

import p11_binarySearch.domain.Player;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Player> players = new TreeSet<>();
        players.add(new Player("Roberto", 10));
        players.add(new Player("Júlio", 6));
        players.add(new Player("Rafael", 5));
        players.add(new Player("Lucas", 15));
        players.add(new Player("Marcelo", -2));
        players.add(new Player("Jhonnatan", -10));
        players.add(new Player("Adalberto", 4));
        players.add(new Player("Eduardo", 13));

        players.removeIf(player -> player.getPoints() < 0);

        //converting to array and printing just for test

        Player[] playersArray = players.toArray(new Player[0]);
        for (Player p : playersArray) {
            System.out.println(p);
        }

        //binary search test (on array cause treeset dont have indices)
        System.out.println("----------------");
        System.out.println("Searching for the player with 15 points");
        int index = Arrays.binarySearch(
                playersArray,
                new Player(null, 15)
        );

        System.out.println(playersArray[index]);

    }
}
