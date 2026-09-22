package p02_inheritance.domain;

public class Bike extends Vehicle{
    public Bike(String model, int maxVelocity) {
        super(model, maxVelocity);
    }

    @Override
    public void accelerate() {
        System.out.println("Generic message on the Bike class");
    }
}
