package jar.garcia.domain;

public class Vehicle {
    private String model;
    private String brand;
    private int year;
    private String color;
    private double value;

    public Vehicle(String model, String brand, int year, String color, double value) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.value = value *105/100; // 5% of taxes
    }

    public void Printer(){ //print everything
        System.out.println("-------------------");
        System.out.println("model = " + this.model);
        System.out.println("brand = " + this.brand);
        System.out.println("year = " + this.year);
        System.out.println("color = " + this.color);
        System.out.println("value = " + this.value);
        System.out.println("-------------------");
    }

    public void PrinterOnlyValue(){ //print only the value
        System.out.println("-------------------");
        System.out.println("value = " + this.value);
        System.out.println("-------------------");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
