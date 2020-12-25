package part1.lesson5;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String telephone, double salary, int age) {
        if (name == null || email == null || position == null || telephone == null) {
            System.out.println("ERROR:Передавать NULL нельзя!");
            System.exit(100);

        } else if (name.isBlank() || position.isBlank() || email.isBlank() || telephone.isBlank()) {
            System.out.println("ERROR:Вызов с пустыми значениями запрещен!");
            System.exit(200);

        } else if (salary <= 0 || age <= 0) {
            System.out.println("ERROR:Зарплата и Возраст должны быть больше 0!");
            System.exit(300);

        } else {
            this.name = name;
            this.position = position;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;

        }

    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null) {
            System.out.println("ERROR:Передавать NULL нельзя!");
            System.exit(101);
        } else if (position.isBlank()) {
            System.out.println("ERROR:Вызов с пустыми значениями запрещен!");
            System.exit(201);
        } else this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("ERROR:Зарплата должна быть больше 0!");
            System.exit(301);
        } else this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
