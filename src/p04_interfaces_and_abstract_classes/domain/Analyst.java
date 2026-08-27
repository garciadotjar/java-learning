package p04_interfaces_and_abstract_classes.domain;

public class Analyst extends Employee{
    public Analyst(String name, double salary) {
        super(name, salary, Role.ANALYST);
    }

    public static double BONUS_PERCENT = 0.05;

    @Override
    public void work() {
        System.out.println("Analyst working");
    }

    @Override
    public void setBonus() {
        salary = salary+salary*BONUS_PERCENT;
    }
}
