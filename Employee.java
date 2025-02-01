public class Employee {
    private String fio;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;
    public Employee(String fio, String position, String email, int phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@mail.ru", 9999999, 30000, 30);
        System.out.println("ФИО: " + employee1.fio + ";\n" + "Должность: " + employee1.position + ";\n" + "email: " + employee1.email + ";\n" + "Телефон: " + employee1.phoneNumber + ";\n" + "Зарплата: " + employee1.salary + ";\n" + "Возраст: " + employee1.age);
    }
}