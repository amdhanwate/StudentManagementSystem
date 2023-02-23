package org.studentManagement;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int deptId;
//    private ArrayList<Subject> subjects;


    public Student(int id, String name, int deptId) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
//        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDeptId() {
        return deptId;
    }

//    public ArrayList<Subject> getSubjects() {
//        return subjects;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

//    public void setSubjects(ArrayList<Subject> subjects) {
//        this.subjects = subjects;
//    }

//    public void addSubject(Subject subject) {
//        this.subjects.add(subject);
//    }
//
//    public void removeSubject(int subjectId) {
//        this.subjects.remove(this.subjects.get(subjectId));
//    }


    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Department: %d", id, name, deptId);
    }
}
