package lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Employee("Ivanov Ivan Ivanich", "engineer", "mail@mail.ru", "415-100", 60000, 35),
                new Employee("Ivanov Ivan Ivanich", "engineer1", "2mail@mail.ru", "415-646", 40000, 50),
                new Employee("Ivanov Ivan Ivanich", "engineer", "6mail@mail.ru", "415-255", 50000, 40),
                new Employee("Ivanov Ivan Ivanich", "engineer2", "7mail@mail.ru", "415-600", 40000, 45),
                new Employee("Ivanov Ivan Ivanich", "engineer", "mail@mail.ru", "415-200", 40000, 25)
        };
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) employees[i].info();

        }

    }


}
