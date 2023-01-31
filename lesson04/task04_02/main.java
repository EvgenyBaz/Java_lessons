// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.


package lesson04.task04_02;


import java.util.Scanner;
import java.util.Stack;

public class main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        String str = "";

        while (!str.equals("print")){
            System.out.println("Введите строку: ");
            str = scan.nextLine();
            if (!str.equals("print")) {
                stack.push(str);
            }
        }
        scan.close();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }      
    }    
}
