package HomeWork1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) { // 1)
        //2) Создать переменные всех пройденных типов данных и инициализировать их значения.
        int jackPower = 1;
        byte val = 127;
        short duck = 2;
        long hand = 4000L;
        float fish = 12.21f;
        double dragon = 21.12;
        char war = 'z';
        boolean rex = false; // 2)

        System.out.println("3." + calculate (1.5f,9.3f,9.2f,3.14f)); // 3)

        System.out.println("4." + task10and20(35, 10)); // 4)

        isPositiveOrNegative(12); // 5)

        System.out.println("6." + isNegative(-77)); //6)

        greetings("учитель"); //7)

        leapYear(); //8)
    }
    /*3) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.*/
    public static float calculate(float a, float b, float c, float d) { // 3)
        return a * (b + (c / d));
    }
    /*4) Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean task10and20(int a, int b) {//4)
        int sum = a + b;
        if (a + b > 10 && a + b < 20) {
            return true;
        } else
            return false;
    }
    /*5)Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
    ноль считаем положительным числом.*/
    public static void isPositiveOrNegative(int c) {
        if(c >= 0) {
            System.out.println("5." + "Number is positive");
        } else {
            System.out.println("5." + "Number is negative");
        }
    }
    /*6)Написать метод, которому в качестве параметра передается целое число. Метод должен
    вернуть true, если число отрицательное.*/
    public static boolean isNegative(int d) {
        if(d <= 0) {
            return true;
        }
        return false;
    }
    /*7)Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    public static void greetings(String name) {
        System.out.println("7." + "Привет, " + name + "!");
    }
    /*8)Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    високосный.*/
    public static void leapYear(){
        for(;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("8.При желании выйти из программы, нажмите 0. \n Для вычисления будет" +
                    " ли год високосным - введите любой год, который вам вздумается!");
            int year = scanner.nextInt();
            if(year == 0)
                break;
            else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                //if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
                //if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                System.out.println("Загаданный вами " + year + " год - высокосный!");
            }else {
                System.out.println("Загаданный вами " + year + " год - невысокосный!");
            }
        }
    }
}
