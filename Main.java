//create a class
class Student {
    // class variables
    int id;
    String name;

    // constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method-display the details
    void display() {
        System.out.println("Name:" + name);
        System.out.println("Id:" + id);
    }
}

// child class
class CollegeStudent extends Student {
    String course;

    // constructor
    CollegeStudent(int id, String name, String course) {
        super(id, name);
        this.course = course;
    }

    // override the parent method
    @Override
    void display() {
        System.out.println("Student Id:" + id);
        System.out.println("Student name:" + name);
        System.out.println("Student course:" + course);
    }
}

// main class
public class Main {
    public static void main(String[] args) {
        // object-used to run class methods
        Student s1 = new Student(101, "Jane Doe");
        CollegeStudent s2 = new CollegeStudent(102, "John Doe", "Computer Science");

        // execute the c lass method
        s1.display();
        s2.display();
    }
}