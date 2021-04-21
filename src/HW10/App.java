package HW10;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Month january = new Month("January", 31, 25);
        Month february = new Month("February", 28, 21);
        Month march = new Month("March", 31, 24);
        Month april = new Month("April", 30, 25);

        Month[] first = {january, february, march, april};
        System.out.println(Arrays.toString(MonthUtils.getYear()));

        Employee german = new Employee("German", 45, 'M', 22);
        Employee roma = new Employee("Roman", 55, 'M', 25);
        Employee katya = new Employee("Katya", 25, 'F', 21);
        Manager igor = new Manager("Igor", 43, 'M', 35, 4);

//        System.out.println(igor.getWorkingDays(first));
//        System.out.println(igor.getSalary(first));
    }
}
