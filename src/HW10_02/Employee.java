package HW10_02;

public abstract class Employee {
    protected String name;
    protected int salary;
    protected static double delta = 0.0;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return salary;
    }

    public void setBaseSalary(int salary) {
        this.salary = salary;
    }

    public abstract int getSalary();


}
