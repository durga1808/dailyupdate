
public class Course {
    
    private String courseName;
    private int courseId;
    private int credits;

    
    public Course(String courseName, int courseId, int credits) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credits = credits;
    }

   
    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCredits() {
        return credits;
    }
}
