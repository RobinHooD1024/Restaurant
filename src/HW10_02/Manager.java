package HW10_02;

public final class Manager extends Employee{
    private int workers;


    public Manager(String name, int salary) {
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
        delta = 0.03;
        return (int)(super.getBaseSalary()*((1.00+delta*workers)));
    }
}
