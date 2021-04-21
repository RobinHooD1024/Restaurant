package HW10_02;

public class Director extends Employee{
    private int workers;


    public Director(String name, int salary) {
        super(name, salary);
    }

    public int getNumbersOfSybordinates() {
        return workers;
    }

    public void setNumbersOfSybordinates(int workers) {
        this.workers = workers;
    }

    @Override
    public int getSalary() {
        delta = 0.09;
        return (int)(super.getBaseSalary()*((1.00+delta*workers)));
    }
}
