package lab1.task2;

public class Course {
    private String title;
    private String description;

    private Student[] students;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] FilterYear(int current_year) {
        Student[] filter_students;
        int nr = 0;
        for(int i = 0; i < students.length; ++i) {
            if(students[i].getYear() == current_year) {
                nr++;
            }
        }
        filter_students = new Student[nr];
        nr = 0;
        for(int i = 0; i < students.length; ++i) {
            if(students[i].getYear() == current_year) {
                filter_students[nr] = new Student();
                filter_students[nr] = students[i];
                nr++;
            }
        }
        return filter_students;
    }
}
