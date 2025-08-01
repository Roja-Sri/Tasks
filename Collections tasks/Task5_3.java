package collectionstasks;
import java.util.*;

// Employee class
class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Task5_3 {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Clare", "HR"),
            new Employee("David", "Finance"),
            new Employee("Eve", "IT")
        );

        // Create a map to group employees by department
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Grouping logic
        for (Employee emp : employees) {
            // If department not in map, add a new list
            departmentMap
                .computeIfAbsent(emp.department, k -> new ArrayList<>())
                .add(emp);
        }

        // Print the grouped employees
        System.out.println("Employees grouped by department:");
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
