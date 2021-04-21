package HW10;

public abstract class BaseEmployee {
    protected String name;
    protected int age;
    protected char sex;
    protected int salary;

    public BaseEmployee() {

    }

    public int getSalary(Month[] months) {
        int result = 0;
        for (Month m: months) {
            result+=(m.getWordDays()*salary);
        }
        return result;
    }



}
