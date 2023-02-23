package org.studentManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

    static void addNewStudent(int id, String name, int deptId) {
        try {
            studentManagementSystem.addStudent(new Student(id, name, deptId));
            System.out.println("Student details added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void showAllStudents() {
        ArrayList<Student> students = studentManagementSystem.getStudents();
        if (students == null || students.size() == 0) System.out.println("No student found");
        else students.forEach(System.out::println);
        System.out.println();
    }

    static Student getStudentByID(int studentId) {
        return studentManagementSystem.getStudentByID(studentId);
    }

    static void studentOperations() {
        System.out.println("[1] Add new student");
        System.out.println("[2] Get all students");
        System.out.println("[3] Get student by ID");
        System.out.println("[0] Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
        int mainMenuChoice = sc.nextInt();

        switch (mainMenuChoice) {
            case 1 -> {
                System.out.print("Enter student id: ");
                int studentId = sc.nextInt();
                System.out.print("Enter student name: ");
                String studentName = sc.next();
                System.out.print("Enter student department id: ");
                int studentDepartment = sc.nextInt();

                addNewStudent(studentId, studentName, studentDepartment);
            }

            case 2 -> showAllStudents();

            case 3 -> {
                System.out.print("Enter student id: ");
                int studentId = sc.nextInt();

                Student student = getStudentByID(studentId);

                if (student == null) System.out.println("Student not found.");
                else System.out.println(student);
                System.out.println();
            }

            case 0 -> {
                System.out.println("Exiting..!");
                return;
            }

            default -> {
                System.out.println("Wrong choice!!");
                System.out.println();
            }
        }
    }
    static void departmentOperations() {
        System.out.println("[1] Add new Department");
        System.out.println("[2] Show all Departments");
        System.out.println("[3] Get department info by ID");
        System.out.println("[0] Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
        int mainMenuChoice = sc.nextInt();

        switch (mainMenuChoice) {
            case 1 -> {
                System.out.print("Enter department id: ");
                int departmentId = sc.nextInt();
                System.out.print("Enter department name: ");
                String departmentName = sc.next();

                addNewDepartment(departmentId, departmentName);
            }

            case 2 -> {
                showAllDepartments();
            }

            case 3 -> {
                System.out.print("Enter department id: ");
                int departmentId = sc.nextInt();

                Department department = getDepartmentByID(departmentId);

                if (department == null) System.out.println("Department not found.");
                else System.out.println(department);
                System.out.println();
            }

            case 0 -> {
                System.out.println("Exiting..!");
                return;
            }

            default -> {
                System.out.println("Wrong choice!!");
                System.out.println();
            }
        }
    }
    static void teacherOperations() {
        System.out.println("[1] Add new teacher");
        System.out.println("[2] Show all teachers");
        System.out.println("[3] Get teacher by ID");
        System.out.println("[0] Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
        int mainMenuChoice = sc.nextInt();

        switch (mainMenuChoice) {
            case 1 -> {
                System.out.print("Enter teacher id: ");
                int teacherId = sc.nextInt();
                System.out.print("Enter teacher name: ");
                String teacherName = sc.next();
                System.out.print("Enter teacher department id: ");
                int teacherDeptId = sc.nextInt();

                addNewTeacher(teacherId, teacherName, teacherDeptId);
            }

            case 2 -> {
                showAllTeachers();
            }

            case 3 -> {
                System.out.print("Enter teacher id: ");
                int teacherId = sc.nextInt();

                Teacher teacher = getTeacherByID(teacherId);

                if (teacher == null) System.out.println("Teacher not found.");
                else System.out.println(teacher);
                System.out.println();
            }

            case 0 -> {
                System.out.println("Exiting..!");
                return;
            }

            default -> {
                System.out.println("Wrong choice!!");
                System.out.println();
            }
        }
    }
    static void subjectOperations() {
        System.out.println("[1] Add new subject");
        System.out.println("[2] Show all subjects");
        System.out.println("[3] Get subject by ID");
        System.out.println("[0] Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
        int mainMenuChoice = sc.nextInt();

        switch (mainMenuChoice) {
            case 1 -> {
                System.out.print("Enter subject id: ");
                int subjectId = sc.nextInt();
                System.out.print("Enter subject name: ");
                String subjectName = sc.next();
                System.out.print("Enter subject department id: ");
                int subjectDeptId = sc.nextInt();
                System.out.print("Enter subject's teacher id: ");
                int subjectTeacherId = sc.nextInt();

                addNewSubject(subjectId, subjectName, subjectDeptId, subjectTeacherId);
            }

            case 2 -> {
                showAllSubjects();
            }

            case 3 -> {
                System.out.print("Enter subject id: ");
                int subjectId = sc.nextInt();

                Subject subject = getSubjectByID(subjectId);

                if (subject == null) System.out.println("Subject not found.");
                else System.out.println(subject);
                System.out.println();
            }

            case 0 -> {
                System.out.println("Exiting..!");
                return;
            }

            default -> {
                System.out.println("Wrong choice!!");
                System.out.println();
            }
        }
    }

    private static Subject getSubjectByID(int subjectId) {
        return studentManagementSystem.getSubjects().stream().filter(subject -> subject.getId() == subjectId).findFirst().orElse(null);
    }

    private static void showAllSubjects() {
        studentManagementSystem.getSubjects().forEach(System.out::println);
    }

    private static void addNewSubject(int subjectId, String subjectName, int subjectDeptId, int teacherId) {
        try {
            Subject subject = new Subject(subjectId, subjectName, subjectDeptId, teacherId);
            studentManagementSystem.addSubject(subject);
            System.out.println("Subject added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    }

    private static Teacher getTeacherByID(int teacherId) {
        return studentManagementSystem.getTeacherByID(teacherId);
    }

    private static void showAllTeachers() {
        ArrayList<Teacher> teachers = studentManagementSystem.getTeachers();
        if (teachers.size() == 0) System.out.println("No teachers found.");
        else teachers.forEach(System.out::println);
    }

    private static void addNewTeacher(int teacherId, String teacherName, int teacherDeptId) {
        try {
            Teacher teacher = new Teacher(teacherId, teacherName, teacherDeptId);
            studentManagementSystem.addTeacher(teacher);
            System.out.println("Teacher added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Department getDepartmentByID(int departmentId) {
        return studentManagementSystem.getDepartmentByID(departmentId);
    }

    private static void showAllDepartments() {
        studentManagementSystem.getDepartments().forEach(System.out::println);
        System.out.println();
    }

    private static void addNewDepartment(int departmentId, String departmentName) {
        try {
            Department department = new Department(departmentId, departmentName);
            studentManagementSystem.addDepartment(department);
            System.out.println("Department added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Student Management System");
        System.out.println("=========================");

        while (true) {
            try {
                System.out.println("[1] Student");
                System.out.println("[2] Department");
                System.out.println("[3] Teacher");
                System.out.println("[4] Subjects");
                System.out.println("[0] Exit");

                System.out.println();
                System.out.print("Enter your choice: ");
                int mainMenuChoice = sc.nextInt();

                switch (mainMenuChoice) {
                    case 1 -> {
                        studentOperations();
                    }

                    case 2 -> {
                        departmentOperations();
                    }

                    case 3 -> {
                        teacherOperations();
                    }

                    case 4 -> {
                        subjectOperations();
                    }

                    case 0 -> {
                        return;
                    }

                    default -> {
                        System.out.println("Wrong choice!!");
                        System.out.println();
                    }
                }
            } catch (InputMismatchException e) {
                String badInput = sc.next();
                System.out.println("Invalid Input: " + badInput);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
            }
        }
    }
}