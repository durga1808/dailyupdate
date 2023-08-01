import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String company;

    public Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
    }
}

public class FindDuplicateEmployees {
    public static void main(String[] args) {
        // Sample list of employee objects with duplicate employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(501, "Jas", "Tcs"));
        employees.add(new Employee(502, "kirti", "Lgs"));
        employees.add(new Employee(503, "nivi", "Vpn"));
        employees.add(new Employee(501, "div", "Tcs")); // Duplicate employee company
        employees.add(new Employee(504, "visa", "Rts"));
        employees.add(new Employee(502, "Smit", "Lgs")); // Duplicate employee company

        // Find and print duplicate company IDs
        findAndPrintDuplicateCompanyIds(employees);
    }

    private static void findAndPrintDuplicateCompanyIds(List<Employee> employeeList) {
        HashSet<String> uniqueCompanyIds = new HashSet<>();
        HashSet<String> duplicateCompanyIds = new HashSet<>();

        for (Employee employee : employeeList) {
            if (!uniqueCompanyIds.add(employee.getCompany())) {
                duplicateCompanyIds.add(employee.getCompany());
            }
        }

        System.out.println("Duplicate company IDs:");
        for (String duplicateCompanyId : duplicateCompanyIds) {
            System.out.println(duplicateCompanyId);
        }
    }
}
