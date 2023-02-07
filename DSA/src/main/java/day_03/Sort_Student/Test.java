package day_03.Sort_Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Trần Thành Long", 22, 8),
                new Student("Nguyễn Ngọc Sơn", 22, 7),
                new Student("Nguyễn Thị Xuân Huơng", 21, 6),
                new Student("Phạm Quỳnh Chi", 21, 9),
                new Student("Quách Vân Trang", 25, 10),
                new Student("Hà Minh Đạt", 18, 5),
                new Student("Đào Phương Linh", 27, 9),
                new Student("Đào Phương Linh", 26, 9)
        ));

        System.out.println("----- Sắp xếp theo họ tên -----");
        sortByFullname(studentList);
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("----- Sắp xếp theo tuổi -----");
        sortByAge(studentList);
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("----- Sắp xếp theo tên -----");
        sortByName(studentList);
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void sortByFullname(List<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.fullname.equals(o2.fullname)) {
                    return o2.age - o1.age;
                }
                return o1.fullname.compareTo(o2.fullname);
            }
        });
    }

    public static void sortByAge(List<Student> students) {
        students.sort( new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age == o2.age) {
                    return o2.GPA - o1.GPA;
                }
                return o1.age - o2.age;
            }
        });
    }

    public static void sortByName(List<Student> students) {
        students.sort( new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.fullname.substring(o1.fullname.lastIndexOf(" ")).equals(o2.fullname.substring(o2.fullname.lastIndexOf(" ")))) {
                    return o2.age - o1.age;
                }
                return o1.fullname.substring(o1.fullname.lastIndexOf(" ")).compareTo(o2.fullname.substring(o2.fullname.lastIndexOf(" ")));
            }
        });
    }
}
