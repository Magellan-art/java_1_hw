package HomeWork5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


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
                + " | Email : " + email + " | Phone number : " + phoneNumber + " | Salary: " + salary + " | Age: "
                + age;
    }
}
