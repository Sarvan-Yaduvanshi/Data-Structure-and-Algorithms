package Object_Oriented_Programming;
public class Constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "SARVAN";
        s1.roll = 1198;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student1 s2 = new Student1(s1); // Copy
        s1.marks[2] = 100;

        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}
class Student1 {
    String name;
    int  roll;
    int[] marks;

    // Shallow Copy Constructors
//    Student1(Student1 s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//
//    }

    // Deep Copy Constructor
    Student1(Student1 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student1() { // Non Parameterized Constructors
        marks = new int[3];
        System.out.println("The Constructors called is......");
    }

    Student1(String name) { // Parametrized Constructors
        marks = new int[3];
        this.name = name;
    }

    Student1(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
