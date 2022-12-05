package lab1.task2;

public class Student {
    private int year;
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
