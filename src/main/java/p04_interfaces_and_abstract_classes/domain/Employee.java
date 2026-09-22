package p04_interfaces_and_abstract_classes.domain;

public abstract class Employee implements Bonusable{
    private String name;
    protected double salary;
    private Role role;

    public Employee(String name, double salary, Role role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", role=" + role +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String work) {
        this.name = work;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
