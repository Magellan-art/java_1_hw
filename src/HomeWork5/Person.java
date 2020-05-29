package HomeWork5;

public class Person {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getFullInfo() {
        return " Full name: " + fullName + " | Position: " + position
                + " | Phone number : " + phoneNumber + " | Salary: " + salary + " | Age: "
                + age;
    }
}
