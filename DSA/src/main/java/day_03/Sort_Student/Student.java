package day_03.Sort_Student;

public class Student {
    public String fullname;
    public int age;
    public int GPA;

    public Student(String fullname, int age, int GPA) {
        this.fullname = fullname;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}
