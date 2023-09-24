package org.java.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("SpellCheckingInspection")
public class SecondHighestSal {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Shashank", 76f);
        Student student5 = new Student(1, "Shekar", 76f);
        Student student2 = new Student(1, "Lovish", 45f);
        Student student4 = new Student(1, "Ketan", 45f);
        Student student3 = new Student(1, "Shivam", 78f);

        Student[] student = {student1, student2, student3, student4, student5};

        List<Student> listSecond = new ArrayList<>();

        SortedSet<Float> list = new TreeSet<>();
        for (int i = 0; i < student.length - 1; i++) {
            list.add(student[i].getMarks());
        }

        Float secondHighest = list.stream().skip(1).findFirst().orElse(null);

        for (Student value : student) {
            if (value.getMarks().equals(secondHighest))
                listSecond.add(value);
        }
        System.out.println(listSecond);
    }

}