package p02_inheritance.domain;

public class Car extends Vehicle{
    public Car(String model, int maxVelocity) {
        super(model, maxVelocity);
    }

    @Override
    public void accelerate() {
        System.out.println("Generic message on the car class");
    }

}
