package com.example.testmvc;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private static ClassRoom instance;
    private List<Student> students;

    private ClassRoom() {
        students = new ArrayList<>();
    }

    public static ClassRoom getInstance() {
        if (instance == null) {
            instance = new ClassRoom();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
