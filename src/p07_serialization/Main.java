//02-09-2026
//first serialization tests. Serialized an object in misc/p07_serialization, and then edited the code to just deserialize
//the file and set the object.

package p07_serialization;

import p07_serialization.domain.FlightPlan;
import p07_serialization.domain.NonSerializableTestClass;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        NonSerializableTestClass nonSerializableTestClass = new NonSerializableTestClass("idk");
        FlightPlan flightPlan1 = new FlightPlan("A320-Neo","PR-XBM", "SBRJ","SBSP","1234", nonSerializableTestClass);
        serialize(flightPlan1);
        deserialize();
    }

    private static void serialize(FlightPlan flightPlan) {
        Path path = Paths.get("misc/p08_hashcode/fplan.ser");
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) {
            out.writeObject(flightPlan);
            System.out.println("Serialized data is saved to " + path.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("misc/p08_hashcode/fplan.ser");
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            FlightPlan flightPlanDeserializedTest = (FlightPlan) inputStream.readObject();
            System.out.println(flightPlanDeserializedTest.toString());
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
