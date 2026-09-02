//sometimes you get external libraries or api, and if you need to serialize them and cant add implements serializable,
//you need to use writeObject() and readObject() methods in other object, like the methods we have in FlightPlan.java
package p07_serialization.domain;

public class NonSerializableTestClass {
    private String idk;

    public NonSerializableTestClass(String idk) {
        this.idk = idk;
    }

    @Override
    public String toString() {
        return "NonSerializableTestClass{" +
                "idk='" + idk + '\'' +
                '}';
    }

    public String getIdk() {
        return idk;
    }
    public void setIdk(String idk) {
        this.idk = idk;
    }
}
