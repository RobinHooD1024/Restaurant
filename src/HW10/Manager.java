package HW10;

public final class Manager extends BaseEmployee{
    private int workers;


    public Manager(String name, int age, char sex, int salary, int workers) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }


    public int getSalary(Month[] months) {
        return (int) (super.getSalary(months)*(1.00+0.01*workers));
    }

    public int getWorkingDays(Month[] months) {
        int workingdays = 0;
        for (Month m : months) {
            workingdays += m.getWordDays();
        }
        return workingdays;
    }
}
