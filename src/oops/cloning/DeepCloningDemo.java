package oops.cloning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DeepCloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Set<EmployeeDeepCloning> deepClonings = new HashSet<EmployeeDeepCloning>();
        deepClonings.add(new EmployeeDeepCloning("ABC", "Developer"));
        deepClonings.add(new EmployeeDeepCloning("PQR", "Tester"));
        deepClonings.add(new EmployeeDeepCloning("XYZ", "Chatu"));

        /*Set<EmployeeDeepCloning> cloningSet = new HashSet<EmployeeDeepCloning>(deepClonings);*/
        Set<EmployeeDeepCloning> cloningSet = new HashSet<EmployeeDeepCloning>(deepClonings.size());

        System.out.println("Original Employee Set: - " + deepClonings);
        System.out.println("Copy of Employee Set: - " + cloningSet);

        /*Iterator<EmployeeDeepCloning> iterator = deepClonings.iterator();
        while (iterator.hasNext()) {
            iterator.next().setDesignation("Friends");
        }*/

        Iterator<EmployeeDeepCloning> iterator = deepClonings.iterator();
        while (iterator.hasNext()) {
            cloningSet.add(iterator.next().clone());
        }

        System.out.println("Original Employee Set: - " + deepClonings);
        System.out.println("Copy of Employee Set: - " + cloningSet);

    }

}
