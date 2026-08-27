package p04_interfaces_and_abstract_classes.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary, Role.MANAGER);
    }

    public static double BONUS_PERCENT = 0.2;

    @Override
    public void work() {
        System.out.println("Manager working");
    }

    @Override
    public void setBonus() {
        salary = salary+salary*BONUS_PERCENT;
    }
}
