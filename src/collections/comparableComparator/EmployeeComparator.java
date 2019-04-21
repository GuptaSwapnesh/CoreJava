package collections.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparator {

    public static void main(String[] args) {

        Employee emp = new Employee("Z", "B", "C");
        Employee emp1 = new Employee("B", "Z", "A");
        Employee emp2 = new Employee("A", "C", "Z");
        Employee emp3 = new Employee("C", "A", "B");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println("Employee list before Sorting");
        printMap(employeeList);

        Collections.sort(employeeList, new Employee.AddressSort());
        System.out.println("Employee list after sorting by Address");
        printMap(employeeList);

        Collections.sort(employeeList, new Employee.DeptSort());
        System.out.println("Employee list after sorting by Department");
        printMap(employeeList);
    }

    private static void printMap(List<Employee> employeeList) {
        System.out.println("**************************************");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
        System.out.println();
    }
}
