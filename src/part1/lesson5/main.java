package part1.lesson5;

public class main {
    public static void main(String[] args) {
        int personalCount = 5;
        Employee[] personal = new Employee[personalCount];

        String[] name = {"Иванов Иван", "Петров Петр", "Сидоров Сидр", "Абрамов Абрам", "Black John"};
        String[] position = {"Программист", "инженер", "devops", "product Owner", "тестировщик"};
        String[] email = {"sample@company.com", "sample@company_1.com", "sample@company_2.com", "sample@company_3.com", "sample@company_4.com",};
        String[] telephone = {"89997772200", "89997772201", "89997772202", "89997772203", "89997772204",};
        double[] salary = {3000.00, 3500.00, 4000.00, 4500.00, 5000.00};
        int[] age = {25, 30, 35, 40, 45};

        for (int i = 0; i < personal.length; i++) {

            personal[i] = new Employee(name[i], position[i], email[i], telephone[i], salary[i], age[i]);

        }

        for (Employee employee : personal ) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    }

}
