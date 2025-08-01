package collectionstasks;

import java.util.*;
import java.util.stream.Collectors;

// Employee1 class
class Employee1 {
    String name;
    String department;

    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Task6_3 {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR"),
            new Employee1("Bob", "IT"),
            new Employee1("Clare", "Finance"),
            new Employee1("David", "IT"),
            new Employee1("Eva", "HR")
        );

        // Group by department using Stream API
        Map<String, List<Employee1>> groupedByDept = employees.stream()
            .collect(Collectors.groupingBy(emp -> emp.department));

        // Print grouped result
        for (Map.Entry<String, List<Employee1>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
