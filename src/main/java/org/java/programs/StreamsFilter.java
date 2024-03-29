package org.java.programs;

import java.util.ArrayList;
import java.util.List;

public class StreamsFilter {

    // Filter all students who's marks are greater than 60 using streams

    public static void main(String[] args) {

        Student student1 = new Student(1, "Shashank", 76f);

        Student student2 = new Student(1, "Lovish", 45f);

        Student student3 = new Student(1, "Shivam", 78f);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        List<Student> list60 = list.stream().filter(student -> student.getMarks() > 60).toList();
        System.out.println("list60 = " + list60);

        List<Student> listanotyher = list.stream().filter(student ->student.getMarks()>=30).toList();
    }
}