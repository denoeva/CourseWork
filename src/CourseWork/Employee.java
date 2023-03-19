package CourseWork;

public class Employee {
    private String name;
    private int department;
    private double salary;
    private static long idCounter = 0;
    private long id;

    public Employee() {
        this.id = idCounter++;
    }

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + this.name +
                ", отдел: " + this.department +
                ", зарплата: " + this.salary + ", id: " + this.id;
    }
}

