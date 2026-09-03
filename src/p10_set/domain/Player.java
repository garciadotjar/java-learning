package p10_set.domain;

import java.io.Serializable;

public class Player implements Serializable, Comparable<Player> {
    private static final long serialVersionUID = 3218181431805906823L;
    private String name;
    private int points;
    private int level;

    public Player(String name, int points, int level) {
        this.name = name;
        this.points = points;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", level=" + level +
                '}';
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(o.getPoints(), this.points);
    }
}
