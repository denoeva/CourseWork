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

//        employeeArray[2].setDepartment(2);
//        employeeArray[4].setDepartment(1);
//        employeeArray[6].setSalary(500000);
//        employeeArray[8].setSalary(100000);

        printAll();
        printSeparator();
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary() + " условных единиц.");
        printSeparator();
        System.out.println(employeeMinSalary() + " с минимальной зарплатой.");
        printSeparator();
        System.out.println(employeeMaxSalary() + " с максимальной зарплатой.");
        printSeparator();
        System.out.println("Средняя сумма затрат на зарплаты в месяц: " + averageSalary() + " условных единиц.");
        printSeparator();
        getFullNames();
        printSeparator();
        increaseSalaryByAmount(0.25);
        printAll();
        printSeparator();
        System.out.println(employeeMinSalary(1));
        printSeparator();
        System.out.println(employeeMaxSalary(1));
        printSeparator();
        System.out.println(sumSalary(1));
        printSeparator();
        System.out.println(averageSalary(9));
        printSeparator();
        increaseSalaryByAmount(0.1, 2);
        printAll();
        printSeparator();
        getFullNames(4);
        printSeparator();
        getEmployeeWithSalaryLess(350_000.0);
        printSeparator();
        getEmployeeWithSalaryMore(400_000.0);
    }

    public static void printSeparator() {
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    // Список всех сотрудников со всеми имеющимися по ним данными
     private static void printAll() {
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
    }

    // Сумма затрат на зарплаты в месяц
    private static double sumSalary() {
        double sumSalary = 0;
        for (Employee employee : employeeArray) {
            sumSalary = sumSalary + employee.getSalary();
        }
        return sumSalary;
    }

    // Сотрудник с минимальной зарплатой
    private static Employee employeeMinSalary() {
        double minSalary = Double.MAX_VALUE;
        Employee minSalaryName = null;
        for (Employee employee : employeeArray) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryName = employee;
            }
        }
        return minSalaryName;
    }

    // Сотрудник с максимальной зарплатой
    private static Employee employeeMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        Employee maxSalaryName = null;
        for (Employee employee : employeeArray) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryName = employee;
            }
        }
        return maxSalaryName;
    }

    // Среднее значение зарплаты
    private static double averageSalary() {
        double averageSalary = 0;
        for (Employee employee : employeeArray) {
            averageSalary = averageSalary + employee.getSalary();
            averageSalary = averageSalary / employeeArray.length;
        }
        return averageSalary;
    }

    // Ф. И. О. всех сотрудников
    private static void getFullNames() {
        for (Employee employee : employeeArray) {
            System.out.println(employee.getName());
        }
    }

    // Индексация зарплаты на указанную величину
    private static void increaseSalaryByAmount(double amount) {
        for (Employee employee : employeeArray) {
            employee.setSalary(employee.getSalary() + employee.getSalary() * amount);
        }
    }

    // Сотрудник с минимальной зарплатой по выбранному отделу
    private static Employee employeeMinSalary(int department) {
        double minSalary = Double.MAX_VALUE;
        Employee minSalaryName = null;
        for (Employee employee : employeeArray) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryName = employee;
            }
        }
        return minSalaryName;
    }

    // Сотрудник с максимальной зарплатой по выбранному отделу
    private static Employee employeeMaxSalary(int department) {
        double maxSalary = Double.MIN_VALUE;
        Employee maxSalaryName = null;
        for (Employee employee : employeeArray) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryName = employee;
            }
        }
        return maxSalaryName;
    }

    // Сумма затрат на зарплаты в месяц по выбранному отделу
    private static double sumSalary(int department) {
        double sumSalary = 0;
        for (Employee employee : employeeArray) {
            if (employee.getDepartment() != department) {
                continue;
            }
            sumSalary = sumSalary + employee.getSalary();
        }
        return sumSalary;
    }

    // Среднее значение зарплаты в месяц по выбранному отделу
    private static double averageSalary(int department) {
        double sum = 0.0;
        int countEmployee = 0;
        for (Employee employee : employeeArray) {
            if (employee.getDepartment() != department) {
                continue;
            }
            sum += employee.getSalary();
            countEmployee++;
        }
        if (countEmployee == 0) {
            System.out.println("Нет сотрудников в отделе " + department);
        }
        return sum / countEmployee;
    }

    // Индексация зарплаты на указанную величину по выбранному отделу
    private static void increaseSalaryByAmount(double amount, int department) {
        for (Employee employee : employeeArray) {
            if (employee.getDepartment() != department) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() * amount);
        }
    }

    // Список сотрудников по выбранному отделу
    private static void getFullNames(int department) {
        for (Employee employee : employeeArray) {
            if (employee.getDepartment() != department) {
                continue;
            }
            System.out.println("Сотрудник: " + employee.getName() +
                    ", зарплата: " + employee.getSalary() +
                    ", id: " + employee.getId());
        }
    }

    // Сотрудник с зарплатой меньше указанной величины
    private static void getEmployeeWithSalaryLess (double salary) {
        for (Employee employee : employeeArray) {
            if (employee.getSalary() < salary) {
                System.out.println("Сотрудник: " + employee.getName() +
                        ", зарплата: " + employee.getSalary() +
                        ", id: " + employee.getId());
            }
        }
    }

    // Сотрудник с зарплатой больше указанной величины
    private static void getEmployeeWithSalaryMore (double salary) {
        for (Employee employee : employeeArray) {
            if (employee.getSalary() > salary) {
                System.out.println("Сотрудник: " + employee.getName() +
                        ", зарплата: " + employee.getSalary() +
                        ", id: " + employee.getId());
            }
        }
    }
}

