package p04_interfaces_and_abstract_classes.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary, Role.DEVELOPER);
    }

    public static double BONUS_PERCENT = 0.1;

    @Override
    public void work() {
        System.out.println("Developer working");
    }

    @Override
    public void setBonus() {
        salary = salary+salary*BONUS_PERCENT;
    }
}
