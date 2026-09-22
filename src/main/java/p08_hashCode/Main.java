//09-02-2026
//just a test to generate hash code using the java hash generator.
package p08_hashCode;

import p08_hashCode.domain.Plane;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("B787", "PS-LAA");
        System.out.println(plane1.toString());
        System.out.println("Hash: "+plane1.hashCode());
    }
}
