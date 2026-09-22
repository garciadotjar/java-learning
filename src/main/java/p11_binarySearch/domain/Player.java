package p11_binarySearch.domain;

import java.util.Objects;

public class Player implements  Comparable<Player> {
    private String name;
    private int points;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(points, o.points);
    }
}
