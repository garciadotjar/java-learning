package p01_oop;

import p01_oop.domain.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Civic", "Honda",  2022,"Black",25000);
        vehicle.Printer(); // print every variable
        vehicle.PrinterOnlyValue(); //print only the value
    }
}