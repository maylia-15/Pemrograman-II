package com.example.praktikummodul7;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void updateStudent(long oldNiml, Student newData) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == oldNiml) {
                students.set(i, newData);
                return;
            }
        }
    }

    public void deleteStudent(long nim) {
        students.removeIf(s -> s.getId() == nim);
    }
}
