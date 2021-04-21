package HW10_02;

public class WorkerUtils {

    public static Employee findByName(Employee[] employees, String name) {
        for (Employee emp:employees) {
            if (emp.getName().equals(name)) return emp;
        }
        return null;
    }

    public static Employee findByNameContains(Employee[] employees, String name) {
        for (Employee emp:employees) {
            if (emp.getName().contains(name)) return emp;
        }
        return null;
    }

    
}
