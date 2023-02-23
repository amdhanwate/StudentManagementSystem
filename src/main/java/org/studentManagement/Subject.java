package org.studentManagement;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String name;
    private int deptId;
    private int teacherId;

    public Subject(int id, String name, int deptId, int teacherId) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.teacherId = teacherId;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Teacher ID: %d, Department ID: %d", id, name, teacherId, deptId);
    }
}
