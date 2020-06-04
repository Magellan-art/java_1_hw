package HomeWork5;

public class HomeWork5 {

    /*  1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        4. Создать массив из 5 сотрудников.
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    */

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов

        persArray[0] = new Person("Blazhevskyi Roman", "junior android developer", "blazhevsky.rom@gmail.com",
                "+38(096)630-98-36", 800, 25);
        persArray[1] = new Person("Ivanov Ivan", "QA", "i vivan@mailbox.com", "+38(098)572-52-68",
                1200, 28);
        persArray[2] = new Person("Getman Danilo", "Senior dev", "danil_getman@gmail.com", "+38(098)546-47-21",
                2800, 41);
        persArray[3] = new Person("Kasper John", "Middle dev", "liderJohn@mail.tu", "+38(096)907-17-53",
                1800, 32);
        persArray[4] = new Person("Biber Jastin", "Team Lead", "loveYouBaby@i.ua", "+38(096)903-55-84",
                3500, 45);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println("List of staff: " + " " + persArray[i].getFullInfo());
            }
        }
    }
}
