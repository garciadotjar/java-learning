package domain;

public class Vehicle {
    private String model;
    private int maxVelocity;

    public Vehicle(String model, int maxVelocity) {
        this.model = model;
        this.maxVelocity = maxVelocity;
    }

    public void accelerate(){
        System.out.println("Vehicle class print");
    }

    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", maxVelocity=" + maxVelocity +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
