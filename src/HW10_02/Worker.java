package HW10_02;

public class Worker extends Employee{
    public Worker(String name, int salary) {
        super(name, salary);
    }

    public int getSalary() {
        return salary;
    }

    public final int getBaseSalary() {
        return salary;
    }
}
