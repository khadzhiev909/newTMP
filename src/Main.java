
public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        printAllInfo();
        printFullName();
    }

    public static void printAllInfo() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println(EMPLOYEES[i]);
        }
    }

    public static int calculateTotalSalary() {
        int n = 0;
        for (Employee employee : EMPLOYEES) {
            n += employee.getSalary();
        }
        return n;
    }

    public static Employee calculateMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    public static Employee calculateMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public static void printFullName() {
        for (Employee empName : EMPLOYEES) {
            System.out.println(empName.getFullName());
        }
    }

    public static double calculateAverageSalary() {
        double mv;
        mv = calculateTotalSalary() / (double) EMPLOYEES.length;
        return mv;
    }

}