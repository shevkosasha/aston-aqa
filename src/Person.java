public class Person {
//    1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//    Конструктор класса должен заполнять эти поля при создании объекта.
//    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    private String name;
//    private String middleName;
//    private String lastName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String name, /*String middleName, String lastName,*/ String position, String email, String phone, double salary, int age) {
        this.name = name;
//        this.middleName = middleName;
//        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        String res =  "Person {" +
                "name = '" + name + '\'' +
//                ", middleName = '" + middleName + '\'' +
//                ", lastName = '" + lastName + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", phone = '" + phone + '\'' +
                ", salary = " + salary +
                ", age = " + age +
                '}';
        System.out.println(res);
        return res;
    }
}
