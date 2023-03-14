package CourseWork;

public class Employee {
    private String name;
    private int department;
    private int salary;
    static int id = 1;

    public Employee (String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name +
                ", отдел: " + department +
                ", зарплата: " + salary + ", id: " + id++;
    }

}