package org.studentManagement;

import java.util.ArrayList;

public class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student getStudentByID(int studentId) {
        Student foundStudent = this.students.stream().filter(student -> student.getId() == studentId).findFirst().orElse(null);
        return foundStudent;
    }

    public void addStudent(Student student) throws Exception {
        if (getStudentByID(student.getId()) != null) throw new Exception("Student ID Already Exists");
        if (getDepartmentByID(student.getDeptId()) == null) throw new Exception("Department Not Found");
        else students.add(student);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getTeacherByID(int teacherId) {
        return teachers.stream().filter(teacher -> teacher.getId() == teacherId).findFirst().orElse(null);
    }

    public void addTeacher(Teacher teacher) throws Exception {
        if (getDepartmentByID(teacher.getDeptId()) == null) throw new Exception("No Department with given ID Exists");
        if (getTeacherByID(teacher.getId()) != null) throw new Exception("Teacher with given ID already exists");
        teachers.add(teacher);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public Subject getSubjectByID(int subjectId) {
        return this.subjects.stream().filter(subject -> subject.getId() == subjectId).findFirst().orElse(null);
    }

    public void addSubject(Subject subject) throws Exception {
        if (getDepartmentByID(subject.getDeptId()) == null) throw new Exception("No Department with given ID Exists");
        if (getSubjectByID(subject.getId()) != null) throw new Exception("Subject with given ID already exists");
        subjects.add(subject);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public Department getDepartmentByID(int departmentId) {
        return this.departments.stream().filter(department -> department.getId() == departmentId).findFirst().orElse(null);
    }

    public void addDepartment(Department department) throws Exception {
        if (this.getDepartmentByID(department.getId()) != null) throw new Exception("Department ID already exits!");
        else departments.add(department);
    }
}
