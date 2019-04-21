package oops.cloning;

public class EmployeeDeepCloning implements Cloneable {

    private String name;
    private String designation;

    public EmployeeDeepCloning(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, designation);
    }

    @Override
    protected EmployeeDeepCloning clone() throws CloneNotSupportedException {
        EmployeeDeepCloning deepCloning = null;
        try {
            deepCloning = (EmployeeDeepCloning) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return deepCloning;
    }
}
