package org.java.oop.encapsulation;

public class Encapsulation {

    // We encapsulate the name & age fields
    // using getter and setter methods. The access to these variables can only
    // be through the methods
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
