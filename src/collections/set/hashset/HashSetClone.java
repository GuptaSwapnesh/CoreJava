package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Swapnesh", "Gupta"));
        employees.add(new Employee("Shikha", "Gupta"));
        employees.add(new Employee("Shefali", "Gupta"));

        // Using clone method. It does shallow copy
        System.out.println("");
        hashSetCloneMethod(employees);

        // Using Copy-constructor
        System.out.println("");
        cloingUsingCopyConstructor(employees);

        // Using deep-copy
        System.out.println("");
        hashSetDeepCopy(employees);
    }

    // Using clone method. It does a shallow copy of the set
    private static void hashSetCloneMethod(Set<Employee> employees) {
        Set<Employee> employees1 = new HashSet<>();
        employees1 = (HashSet<Employee>) ((HashSet<Employee>) employees).clone();

        System.out.println("Elements in first set are:- " + employees);
        System.out.println("Elements in cloned set are:- " + employees1);

        employees = iterateHashSetElements(employees, "Nirmal Gupta");

        System.out.println("Elements in first set are:- " + employees);
        System.out.println("Elements in cloned set are:- " + employees1);
    }

    // Using Copy-constructor. It using the costructor of the Employee Class
    private static void cloingUsingCopyConstructor(Set<Employee> employees) {

        Set<Employee> employees2 = new HashSet<>(employees);

        System.out.println("Elements in first set are:- " + employees);
        System.out.println("Elements in cloned set are:- " + employees2);

        employees = iterateHashSetElements(employees, "Gupta");

        System.out.println("Elements in first set are:- " + employees);
        System.out.println("Elements in cloned set are:- " + employees2);
    }

    private static void hashSetDeepCopy(Set<Employee> employees) throws CloneNotSupportedException {

        Set<Employee> deepClone = new HashSet<>(employees.size());

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            deepClone.add(employeeIterator.next().clone());
        }

        System.out.println("Elements in first set are:- " + employees);
        System.out.println("Elements in cloned set are:- " + deepClone);

        employees = iterateHashSetElements(employees, "Nirmal Gupta");

        System.out.println("Elements in first set are:- " + employees);
        System.out.println("Elements in cloned set are:- " + deepClone);
    }

    private static Set<Employee> iterateHashSetElements(Set<Employee> employees, String surname) {
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            employeeIterator.next().setSurname(surname);
        }
        return employees;
    }
}

class Employee implements Cloneable {

    String name;
    String surname;

    public Employee() {
    }

    public Employee(String fName, String lName) {
        this.name = fName;
        this.surname = lName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + "-" + surname;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee employee = null;
        try {
            employee = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
