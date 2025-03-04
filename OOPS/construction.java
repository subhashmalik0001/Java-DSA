package OOPS;

public class construction {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "subhash";
        s1.roll = 456;
        s1.password = "xyz";
        // int marks[];

        Student s2 = new Student(s1);
        s2.password = "xyz";

        // Student s2 = new Student("subhash");
        // Student s3 = new Student(125);
        // Student s4 = new Student("subh", 124); no constr of these 2 parameter

        // System.out.println(s1.name);

    }

}

class Student {
    String name;
    int roll;
    String password;

    // constructer

    // copy constructer

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student() { // non perameterized
        System.out.println("constructer is called...");
    }

    Student(String name) { // parameterized
        this.name = name;

    }

    Student(int roll) {
        this.roll = roll;
    }
}
