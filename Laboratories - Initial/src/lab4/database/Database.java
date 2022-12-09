package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    public static Database instance = null;
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    public static int instanceCount = 0;

    public Database() {
        instanceCount++;
    }

    public static Database getDatabase() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teachersByList = new ArrayList<>();
        for(Teacher current: teachers) {
            if(current.getSubjects().contains(subject)) {
                teachersByList.add(new Teacher(current));
            }
        }
        return teachersByList;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studentsByList = new ArrayList<>();
        for(Student current: students) {
            if(current.getSubjects().containsKey(subject)) {
                studentsByList.add(new Student(current));
            }
        }
        return studentsByList;
    }

    public List<Student> getStudentsByAverageGrade() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.averageGrade() < o2.averageGrade()) {
                    return 1;
                }
                return 0;
            }

        });
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> newList = this.getStudentsBySubject(subject);
        newList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGradeForSubject(subject) < o2.getGradeForSubject(subject)) {
                    return 1;
                }
                return 0;
            }
        });

        return newList;
    }
}
