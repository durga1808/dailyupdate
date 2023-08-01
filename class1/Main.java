
public class Main {
    public static void main(String[] args) {
        // Create Emp object
        Emp emp1 = new Emp("yoga", 22, "202305");

        // Create Course object
        Course course1 = new Course("Introduction to Java Programming", 101, 5);

        // Display student and course details
        System.out.println("Employee details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Age: " + emp1.getAge());
        System.out.println("EmpID: " + emp1.getempId());

        System.out.println("\nCourse details:");
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Course ID: " + course1.getCourseId());
        System.out.println("Credits: " + course1.getCredits());
    }
}
