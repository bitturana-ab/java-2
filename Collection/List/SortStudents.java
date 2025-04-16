
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age:" + age + ",name:" + name + "]";
    }

    //default comare logic
    @Override
    public int compareTo(Student that) {
        if (this.age < that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class SortStudents {

    public static void main(String arg[]) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(18, "Bittu"));
        stud.add(new Student(19, "Ancqa"));
        stud.add(new Student(21, "Sanjay"));
        stud.add(new Student(50, "Bittu Vijay"));
        // System.out.println(stud);
        // for (Student s : stud) {
        //     System.out.println(s);
        // }
        // Comparator<Student> com = new Comparator<Student>() {
        //     public int compare(Student i, Student j) {
        //         if (i.age > j.age) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // };
        //or using lemba expression and ternary operator
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        Collections.sort(stud, com);
        System.out.println("After sorting with comparator");

        for (Student s : stud) {
            System.out.println(s);
        }
        //or implements method use 
        Collections.sort(stud);

        System.out.println("After sorting with age logic in implemenents comparable");

        for (Student s : stud) {
            System.out.println(s);
        }
    }
}
