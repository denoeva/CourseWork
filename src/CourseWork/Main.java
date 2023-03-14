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

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
    }
}