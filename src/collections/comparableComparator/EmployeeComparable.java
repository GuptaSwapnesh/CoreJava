package collections.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class EmployeeComparable {

    public static void main(String[] args) {

        Employee emp = new Employee("Z");
        Employee emp1 = new Employee("B");
        Employee emp2 = new Employee("A");
        Employee emp3 = new Employee("C");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println("Elements of the HashMap before Sorting");
        printMap(employeeList);

        Collections.sort(employeeList);
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
