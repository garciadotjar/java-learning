package p02_inheritance;// 08-21-2026
//Just a simple project to understand the inheritance (Car is a Vehicle and Bike too),
// and the method override (like the method accelerate that exist on the Vehicle.java and the Car.java and Bike.java)

import p02_inheritance.domain.Bike;
import p02_inheritance.domain.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", 300);
        car.accelerate();
        System.out.println(car.toString());

        Bike bike = new Bike("Yamaha",240);
        bike.accelerate();
        System.out.println(bike.toString());
    }
}
