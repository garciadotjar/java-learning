package p08_hashCode.domain;

public class Plane {
    private String model;
    private String registration;

    public Plane(String model, String registration) {
        this.model = model;
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", registration='" + registration + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return model == null ? 0 : this.model.hashCode();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
