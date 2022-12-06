package lab1.task2;

import java.util.Arrays;

public class test {
    private static Object toString;

    public static void main(String[] args) {
        int test_year = 2019;
        // dc nu merge ? test_year = Integer.parseInt(args[0]);
        Course course = new Course();
        course.setTitle("Testare");
        course.setDescription("Manuala");
        course.setStudents(new Student[4]);

        for(int i = 0; i < 4; ++i) {
            course.getStudents()[i] = new Student();
        }

        course.getStudents()[0].setName("Alex");
        course.getStudents()[0].setYear(2016);
        course.getStudents()[1].setName("Marius");
        course.getStudents()[1].setYear(2019);
        course.getStudents()[2].setName("Alina");
        course.getStudents()[2].setYear(2017);
        course.getStudents()[3].setName("Karina");
        course.getStudents()[3].setYear(2019);
        System.out.println(Arrays.toString(course.FilterYear(test_year)));

        Student s1 = new Student();
        s1.setName("Andrei");
        s1.setYear(2015);

        Student s2 = new Student();
        s2.setName("Andrei");
        s2.setYear(2015);
        System.out.println(s1.equals(s2));

    }
}
