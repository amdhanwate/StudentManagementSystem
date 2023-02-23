package org.studentManagement;

public class Teacher {
    private int id;
    private String name;
    private int deptId;

    private int subjectId;

    public Teacher(int id, String name, int deptId) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
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

    public int getSubjectId() {
        return subjectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept_id(int dept_id) {
        this.deptId = dept_id;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Department ID: %d", id, name, deptId);
    }
}
