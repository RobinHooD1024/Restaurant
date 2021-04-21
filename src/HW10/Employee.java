package HW10;

public final class Employee extends BaseEmployee{

    public Employee(String name, int age, char sex, int salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(Month[] months) {
        int result = 0;
        for (Month m: months) {
            result+=(m.getWordDays()*salary);
        }
        return result;
    }
}
