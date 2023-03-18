package CourseWork;

public class Main {
    public static Employee[] employeeArray = new Employee[10];

    public static void main(String[] args) {
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

        employeeArray[2].setDepartment(2);
        employeeArray[4].setDepartment(1);
        employeeArray[6].setSalary(500000);
        employeeArray[8].setSalary(100000);

        printAll();
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary() + " условных единиц.");
        System.out.println("Сотрудник " + employeeMinSalary() + " с минимальной зарплатой.");
        System.out.println("Сотрудник " + employeeMaxSalary() + " с максимальной зарплатой.");
        System.out.println("Средняя сумма затрат на зарплаты в месяц: " + averageSalary() + " условных единиц.");
        getFullNames();
    }

    private static void printAll() {
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
    }

    private static int sumSalary() {
        int sumSalary = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sumSalary = sumSalary + employeeArray[i].getSalary();
        }
        return sumSalary;
    }

    private static String employeeMinSalary() {
        int minSalary = employeeArray[0].getSalary();
        String minSalaryName = employeeArray[0].getName();
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < minSalary) {
                minSalary = employeeArray[i].getSalary();
                minSalaryName = employeeArray[i].getName();
            }
        }
        return minSalaryName;
    }

    private static String employeeMaxSalary() {
        int maxSalary = employeeArray[0].getSalary();
        String maxSalaryName = employeeArray[0].getName();
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() > maxSalary) {
                maxSalary = employeeArray[i].getSalary();
                maxSalaryName = employeeArray[i].getName();
            }
        }
        return maxSalaryName;
    }

    private static int averageSalary() {
        int averageSalary = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            averageSalary = averageSalary + employeeArray[i].getSalary();
            averageSalary = averageSalary / employeeArray.length;
        }
        return averageSalary;
    }

    private static void getFullNames() {
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i].getName());
        }
    }
}

