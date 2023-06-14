package org.java.programs;

public class Student {

    Integer no;
    String name;
    Float marks;

    public Student(Integer no, String name, Float marks) {
        this.no = no;
        this.name = name;
        this.marks = marks;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
