package p07_serialization.domain;

import java.io.*;

public class FlightPlan implements Serializable {
    private static final long serialVersionUID = 5210088120409332553L;

    private String planeModel;
    private String planeRegistration;
    private String departure;
    private String arrival;
    private transient String cockpitPassword; // TRANSIENT MAKE IT NON-SERIALIZABLE, USED ON SENSITIVE INFORMATION
    private transient NonSerializableTestClass nonSerializableTestClass; //JUST USING TO TEST HOW TO SERIALIZE NON-SERIALIZABLE OBJECTS


    public FlightPlan(String planeModel, String planeRegistration, String departure, String arrival, String cockpitPassword, NonSerializableTestClass nonSerializableTestClass) {
        this.planeModel = planeModel;
        this.planeRegistration = planeRegistration;
        this.departure = departure;
        this.arrival = arrival;
        this.cockpitPassword = cockpitPassword;
        this.nonSerializableTestClass = nonSerializableTestClass;
    }

    private void writeObject(ObjectOutputStream out){
        try{
            out.defaultWriteObject();
            out.writeUTF(nonSerializableTestClass.getIdk());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream inputStream){
        try{
            inputStream.defaultReadObject();
            String idk = inputStream.readUTF();
            nonSerializableTestClass = new NonSerializableTestClass(idk);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "FlightPlan{" +
                "planeModel='" + planeModel + '\'' +
                ", planeRegistration='" + planeRegistration + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", cockpitPassword='" + cockpitPassword + '\'' +
                ", nonSerializableTestClass=" + nonSerializableTestClass +
                '}';
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public String getPlaneRegistration() {
        return planeRegistration;
    }

    public void setPlaneRegistration(String planeRegistration) {
        this.planeRegistration = planeRegistration;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getCockpitPassword() {
        return cockpitPassword;
    }
    public void setCockpitPassword(String cockpitPassword) {
        this.cockpitPassword = cockpitPassword;
    }

    public NonSerializableTestClass getNonSerializableTestClass() {
        return nonSerializableTestClass;
    }

    public void setNonSerializableTestClass(NonSerializableTestClass nonSerializableTestClass) {
        this.nonSerializableTestClass = nonSerializableTestClass;
    }
}
