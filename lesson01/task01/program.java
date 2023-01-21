// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”


package lesson01.task01;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.printf("введите имя ");
        Scanner iScanner = new Scanner(System.in,"Cp866");
        // Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();

        System.out.println("Привет "+ name);
        iScanner.close();
    }
}


// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида

// import java.time.LocalDateTime;

// System.out.printf("Сейчас %dч\n", LocalDateTime.now().getHour());
//         int hourNow = LocalDateTime.now().getHour();
//         if (hourNow > 5 && hourNow < 12) {
//             System.out.println("Доброе утро!");
//         } else if (hourNow > 12 && hourNow < 18) {
//             System.out.println("Доброго дня!");
//         } else if (hourNow > 18 && hourNow < 22) {
//             System.out.println("Добрый вечер!");
//         } else {
//             System.out.println("Пора спать!");
//         }
