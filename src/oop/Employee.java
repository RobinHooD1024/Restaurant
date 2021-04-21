package oop;

public class Employee extends Person{

    protected String title;
    protected int salary;

    public Employee() {
        System.out.println("Employee 1st constructor");
    }

    public Employee(String name, int age, String gender) {
        super(name,age,gender);
        System.out.println("Employee 2nd constructor");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
        System.out.println("Employee 3nd constructor");
    }

    public boolean isSameName(Employee employee) {
        return employee.getName().equals(this.name);
    }
}
