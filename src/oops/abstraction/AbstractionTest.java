package oops.abstraction;

public class AbstractionTest {

    public static void main(String[] args) {

        Employee employee1 = new PartTimeEmployee("ABC", 80, 6);
        Employee employee2 = new FullTimeEmployee("PQR", 100);

        System.out.println("Part time Employee Salary:- " +employee1.calculateSalary());
        System.out.println("Full time Employee Salary:- " +employee2.calculateSalary());

    }
}
