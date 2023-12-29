package org.java.passbyvaueandreference;

public class PassByReference {

    String x ;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    PassByReference(String x) {
        this.x = x;
    }

    public static void modifyObject(PassByReference passByReference) {
        int hashCode = passByReference.hashCode();
        System.out.println("Memory Address (Hash Code) in the receiving method: " + hashCode);

        passByReference.setX("Not Saying Anything");
        System.out.println("Inside method: " + passByReference.getX() + "\n");
    }


    /**
     * This behavior might look like pass-by-reference, but it's important to clarify that the reference itself is passed by value.
     * The changes made to the object's state inside the method are reflected outside the method,
     * demonstrating the concept of passing the reference by value in Java.
     * */
    public static void main(String[] args) {
        PassByReference obj = new PassByReference("Saying Hello");
        modifyObject(obj);

        int hashCode = obj.hashCode();
        System.out.println("Memory Address (Hash Code) in the passing method: " + hashCode);
        System.out.println("Outside method: " + obj.getX());
    }

}