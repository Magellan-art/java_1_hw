package HomeWork3Guess;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3Guess {
/*1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        do {
            int randomNumber = random.nextInt(10);
            System.out.println("Угадайте число от 0 до 9");
            for ( int myAttempts = 3; myAttempts > 0; myAttempts--) {
                int userNumber = sc.nextInt();
                if (userNumber == randomNumber) {
                    System.out.println("Вы победили!");
                    break;
                } if (userNumber > randomNumber ) {
                    System.out.println("Число слишком велико. Введите поменьше.");
                } else  {
                    System.out.println("Число слишком маленькое. Введите побольше.");
                }
                if  (myAttempts - 1 > 0){
                    System.out.println("У вас осталось " + (myAttempts - 1) + " попыток.");
                }else{
                    System.out.println("Попытки закончились.Вы проиграли!");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        }
        while (sc.nextInt() == 1);
        sc.close();
    }
}

/*import java.util.Random;
import java.util.Scanner;

public class HomeWork3Guess {
   // Здесь я написал программу "угадай число" с двумя вечными циклами.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Подтвердите свое действие: играть нажмите 1 или выйти 0");
            int realPick = sc.nextInt();
            if (realPick == 0) {
                break;
            }
            int randomNumber = random.nextInt(100);
            for (;;) {
                System.out.println("Угадайте число от 0 до 99");
                int userNumber = sc.nextInt();
                if (randomNumber == userNumber) {
                    System.out.println("Вы победили!\n Повторить игру еще раз? 1 – да / 0 – нет");
                    int pick = sc.nextInt();
                    if (pick >= 0) {
                        break;
                    }
                } else if (randomNumber < userNumber) {
                    System.out.println("Число слишком велико. Введите поменьше.");
                } else if (randomNumber > userNumber) {
                    System.out.println("Число слишком маленькое. Введите побольше.");
                }
            }
        }
        sc.close();
    }
}*/




/*import java.util.Random;
import java.util.Scanner;

public class HomeWork3Guess {
    //Это подобие программы выше, которая с двумя вечными циклами, только это с ограниченымми попытками и
   // одним вечным циклом.Так сказать соответствует изначальным заданым требованиям
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    while (true) {
        System.out.println("Подтвердите свое действие: играть? нажмите 1; выйти? 0");
        int realChoise = sc.nextInt();
        if (realChoise == 0) {
            break;
        }
        int randomNumber = random.nextInt(10);
        for (int attempt = 0; attempt < 3; attempt++) {
            System.out.println("Угадайте число от 0 до 9");
            int userNumber = sc.nextInt();
            if (randomNumber == userNumber) {
                System.out.println("Вы победили!\n Повторить игру еще раз? 1 – да / 0 – нет");
                int winChoise = sc.nextInt();
                if (winChoise >= 0)
                    break;
                    
            } else if (randomNumber < userNumber && attempt + 1 < 3) {
                System.out.println("Число слишком велико. Введите поменьше.");

            } else if (randomNumber > userNumber  && attempt + 1 < 3) {
                System.out.println("Число слишком маленькое. Введите побольше.");

            }
            if (attempt + 1 < 3) {
                System.out.println("Ваша " + (attempt + 1) + " попытка.");
            }else{
                System.out.println("Попытки закончились. Вы проиграли! Правильное число: " +
                        randomNumber + " \nПовторить игру еще раз? 1 – да / 0 – нет");

                int loseChoise = sc.nextInt();
                if (loseChoise >= 0) {
                    break;
                }
            }
        }
    }
}
}*/

