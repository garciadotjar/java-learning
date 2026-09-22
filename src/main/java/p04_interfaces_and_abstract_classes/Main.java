package p04_interfaces_and_abstract_classes;
//08-26-2026
//simple test of enums, abstract classes, interfaces and other things
import p04_interfaces_and_abstract_classes.domain.Analyst;
import p04_interfaces_and_abstract_classes.domain.Developer;
import p04_interfaces_and_abstract_classes.domain.Manager;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Roberto",2000);
        Manager manager1 = new Manager("Lucas", 5000);
        Analyst analyst1 = new Analyst("Eduardo", 3000);

        developer1.setBonus();
        manager1.setBonus();
        analyst1.setBonus();

        System.out.println(developer1.toString());
        System.out.println(manager1.toString());
        System.out.println(analyst1.toString());
    }
}