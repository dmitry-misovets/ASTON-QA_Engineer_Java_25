public class Employees {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Директор",
                "ivivan@mailbox.com", "+7 (923) 123-12-75", 130000,49);
        persArray[1] = new Person("Петров Пётр","Заместитель Директора",
                "petrov@gmail.com", "+7 (928) 123-45-45", 120000,47);
        persArray[2] = new Person("Васильев Василий", "Архитектор ПО",
                "vasyalol@yandex.ru", "+7 (925) 987-56-35", 115000,42);
        persArray[3] = new Person("Юрьев Юрий",  "Программист",
                "jurassic@mail.ru",  "+7 (918) 107-37-22", 110000,30);
        persArray[4] = new Person("Александров Александр", "Охранник",
                "topgun@minbox.ru", "+7 (929) 127-46-06", 35000,35);
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +
                "\n| Должность: " + position +
                "\n| E-mail: " + email +
                "\n| Телефон: " + phone +
                "\n| Оклад: " + salary + " руб." +
                "\n| Возраст: " + age + " " + ".";
    }
}
