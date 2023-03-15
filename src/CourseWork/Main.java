package CourseWork;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[10];
        employeeArray[0] = new Employee("Донской Михаил Владимирович", 1, 212073);
        employeeArray[1] = new Employee("Касперский Евгений Валентинович", 2, 481015);
        employeeArray[2] = new Employee("Данилов Игорь Анатольевич", 3, 306998);
        employeeArray[3] = new Employee("Крюков Дмитрий Витальевич", 4, 310722);
        employeeArray[4] = new Employee("Сегалович Илья Валентинович", 5, 431412);
        employeeArray[5] = new Employee("Дуров Павел Валерьевич", 1, 329447);
        employeeArray[6] = new Employee("Волож Аркадий Юрьевич", 3, 329913);
        employeeArray[7] = new Employee("Нуралиев Борис Георгиевич", 5, 329913);
        employeeArray[8] = new Employee("Кириенко Владимир Сергеевич", 4, 334860);
        employeeArray[9] = new Employee("Мильнер Юрий Борисович", 2, 319340);

        System.out.println("\n" +
                "Новое задание");
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println("\n" +
                "Новое задание");
        int sumSalary = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sumSalary = sumSalary + employeeArray[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary + " условных единиц.");

        System.out.println("\n" +
                "Новое задание");
        int minSalary = employeeArray[0].getSalary();
        String minSalaryName = employeeArray[0].getName();
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < minSalary) {
                minSalary = employeeArray[i].getSalary();
                minSalaryName = employeeArray[i].getName();
            }
        }
        System.out.println("Сотрудник " + minSalaryName + " с минимальной зарплатой в размере " + minSalary + " условных единиц.");

        System.out.println("\n" +
                "Новое задание");
        int maxSalary = employeeArray[0].getSalary();
        String maxSalaryName = employeeArray[0].getName();
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() > maxSalary) {
                maxSalary = employeeArray[i].getSalary();
                maxSalaryName = employeeArray[i].getName();
            }
        }
        System.out.println("Сотрудник "+ maxSalaryName + " с минимальной зарплатой в размере " + maxSalary + " условных единиц.");

        System.out.println("\n" +
                "Новое задание");
        //int sumSalary = 0;
        int averageSalary = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sumSalary = sumSalary + employeeArray[i].getSalary();
            averageSalary = sumSalary / employeeArray.length;
        }
        System.out.println("Средняя сумма затрат на зарплаты в месяц: " + averageSalary + " условных единиц.");

        System.out.println("\n" +
                "Новое задание");
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i].getName());
        }
    }
}