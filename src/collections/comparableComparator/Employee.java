package collections.comparableComparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String name;
    private String deptName;
    private String address;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String dept, String add) {
        this.name = name;
        this.deptName = dept;
        this.address = add;
    }

    public String getName() {
        return name;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }

    public static class AddressSort implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getAddress().compareTo(o2.getAddress());
        }
    }

    public static class DeptSort implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getDeptName().compareTo(o2.getDeptName());
        }
    }
}
