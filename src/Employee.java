import java.util.stream.IntStream;

public class Employee {
    private static int correntId = 1;
    private String fullName;
    private int salary;
    private int id;
    private int deportamentId;


    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getDeportamentId() {
        return deportamentId;
    }

    public int getCorrentId() {
        return correntId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDeportamentId(int deportamentId) {
        this.deportamentId = deportamentId;
    }

    public Employee(int deportamentId, String fullName, int salary) {
        this.deportamentId = deportamentId;
        this.fullName = fullName;
        this.id = correntId++;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", deportamentId=" + deportamentId +
                '}';
    }
}