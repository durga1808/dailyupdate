// Emp.java
public class Emp {
    // Attributes
    private String name;
    private int age;
    private String empId;

    
    public Emp(String name, int age, String empId) {
        this.name = name;
        this.age = age;
        this.empId = empId;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getempId() {
        return empId;
    }
}
