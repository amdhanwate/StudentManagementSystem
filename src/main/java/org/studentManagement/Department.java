package org.studentManagement;

import java.util.ArrayList;

public class Department {
//    add teacher list here
    private int id;
    private String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(int studentId) {
        this.students.remove(this.students.stream().filter(student -> student.getId() == studentId).findFirst());
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void removeTeacher(int teacherId) {
        this.teachers.remove(this.teachers.stream().filter(teacher -> teacher.getId() == teacherId).findFirst());
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s", this.id, this.name);
    }
}
